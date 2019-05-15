package com.hendisantika.springboottdd.adafterinput.feed;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hendisantika.springboottdd.adafterinput.incoming.creditAgency.AgencyRating;
import com.rometools.rome.feed.atom.Feed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.thymeleaf.util.DateUtils;

import java.io.IOException;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ddd
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-16
 * Time: 06:41
 */
@Component
public class CreditAgencyPoller {
    private final Logger log = LoggerFactory.getLogger(CreditAgencyPoller.class);
    // Sprint Rest Template
    RestTemplate restTemplate;
    @Value("${creditAgencyFeed}")
    private String creditAgencyFeed;
    private Date lastModified = null;
    private ScoringApplicationService scoringApplicationService;

    @Autowired
    public CreditAgencyPoller(RestTemplate restTemplate, ScoringApplicationService scoringApplicationService) {
        this.lastModified = new Date();
        this.restTemplate = restTemplate;
        this.scoringApplicationService = scoringApplicationService;

    }

    @Scheduled(fixedDelay = 30000)
    public void poll() {

        HttpHeaders requestHeaders = new HttpHeaders();
        if (lastModified != null) {
            requestHeaders.set("If-Modified-Since", DateUtils.formatDate(lastModified));
        }
        HttpEntity<?> requestEntity = new HttpEntity(requestHeaders);
        log.info("Polling Credit Agency for new ratings");

        ResponseEntity<Feed> response = restTemplate.exchange(creditAgencyFeed, HttpMethod.GET, requestEntity, Feed.class);

        if (response.getStatusCode() != HttpStatus.NOT_MODIFIED) {
            Feed feed = response.getBody();
            Date lastUpdateInFeed = null;
            ObjectMapper mapper = new ObjectMapper();
            for (Entry entry : feed.getEntries()) {
                String ratingAsJson = entry.getSummary().getValue();
                if ((lastModified == null) || (entry.getUpdated().after(lastModified))) {
                    log.info(entry.getTitle() + " is new, processing");
                    try {
                        AgencyRating agencyRating = mapper.readValue(ratingAsJson, AgencyRating.class);
                        scoringApplicationService.scoreAgencyResult(agencyRating.getFirstName(),
                                agencyRating.getLastName(),
                                agencyRating.getStreet(),
                                agencyRating.getPostCode(),
                                agencyRating.getCity(),
                                agencyRating.getPoints());
                        lastUpdateInFeed = entry.getUpdated();
                    } catch (IOException e) {
                        //we should handle this exception more properly
                        e.printStackTrace();
                    }

                }
            }
            if (response.getHeaders().getFirst("Last-Modified") != null) {
                lastModified = DateUtils.parseDate(response.getHeaders().getFirst("Last-Modified"));
                log.info("LastModified header {}", lastModified);
            } else {
                if (lastUpdateInFeed != null) {
                    lastModified = lastUpdateInFeed;
                    log.info("Last in feed {}", lastModified);
                }

            }
        }
    }
}
package com.hendisantika.springbootddd.creditagency.messaging;

import com.hendisantika.springbootddd.creditagency.events.ApplicationSubmittedEvent;
import com.hendisantika.springbootddd.creditagency.events.incoming.Applicant;
import com.hendisantika.springbootddd.creditagency.service.PersonRatingQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ddd
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-03
 * Time: 06:51
 */
@Component
public class IncomingMessageListener {

    private PersonRatingQueryService personRatingQueryService;

    @Autowired
    public IncomingMessageListener(PersonRatingQueryService personRatingQueryService) {
        this.personRatingQueryService = personRatingQueryService;
    }

    @StreamListener(CreditAgencyChannels.APPLICATION_SUBMITTED)
    public void receiveApplicationSubmission(@Payload ApplicationSubmittedEvent applicationSubmittedEvent) {

        System.out.println("received " + applicationSubmittedEvent.getFirstApplicant().toString());
        Applicant applicant = applicationSubmittedEvent.getFirstApplicant();
        personRatingQueryService.ratePerson(applicant.getFirstName(),
                applicant.getLastName(),
                applicant.getAddress().getStreet(),
                applicant.getAddress().getPostCode(),
                applicant.getAddress().getCity());
    }


}
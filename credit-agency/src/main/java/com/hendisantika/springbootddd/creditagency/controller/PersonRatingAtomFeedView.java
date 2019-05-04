package com.hendisantika.springbootddd.creditagency.controller;

import com.hendisantika.springbootddd.creditagency.repository.PersonRatingRepository;
import com.rometools.rome.feed.atom.Content;
import com.rometools.rome.feed.atom.Feed;
import com.rometools.rome.feed.atom.Link;
import com.rometools.rome.feed.atom.Person;
import com.rometools.rome.feed.synd.SyndPerson;
import org.springframework.web.servlet.view.feed.AbstractAtomFeedView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ddd
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-04
 * Time: 08:47
 */
public class PersonRatingAtomFeedView extends AbstractAtomFeedView {
    private PersonRatingRepository personRatingRepository;

    public PersonRatingAtomFeedView(PersonRatingRepository personRatingRepository) {
        this.personRatingRepository = personRatingRepository;
    }

    protected void buildFeedMetadata(Map<String, Object> model, Feed feed, HttpServletRequest request) {
        feed.setId("https://github.com/mploed/ddd-with-spring/credit-agency");
        feed.setTitle("Credit Agency Ratings");
        List<Link> alternateLinks = new ArrayList<>();
        Link link = new Link();
        link.setRel("self");
        link.setHref(baseUrl(request) + "feed");
        alternateLinks.add(link);
        List<SyndPerson> authors = new ArrayList<SyndPerson>();
        Person person = new Person();
        person.setName("Big Pug Bank");
        authors.add(person);
        feed.setAuthors(authors);

        feed.setAlternateLinks(alternateLinks);
        feed.setUpdated(personRatingRepository.lastUpdate());
        Content subtitle = new Content();
        subtitle.setValue("List of all valid person ratings");
        feed.setSubtitle(subtitle);
    }

    private String baseUrl(HttpServletRequest request) {
        return String.format("%s://%s:%d%s/", request.getScheme(), request.getServerName(), request.getServerPort(),
                request.getContextPath());
    }

}

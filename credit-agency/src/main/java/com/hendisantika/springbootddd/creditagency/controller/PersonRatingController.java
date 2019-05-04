package com.hendisantika.springbootddd.creditagency.controller;

import com.hendisantika.springbootddd.creditagency.repository.PersonRatingRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ddd
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-04
 * Time: 08:50
 */
@Controller
@RequestMapping("person-rating")
public class PersonRatingController {
    private PersonRatingRepository personRatingRepository;

    public PersonRatingController(PersonRatingRepository personRatingRepository) {
        this.personRatingRepository = personRatingRepository;
    }

    @RequestMapping(value = "/feed", produces = "application/atom+xml")
    public ModelAndView orderFeed(WebRequest webRequest, HttpServletResponse response) {

        Date lastUpdate = personRatingRepository.lastUpdate();
        // null handling for a new start of the application with no current ratings in it
        if (lastUpdate != null) {
            response.setDateHeader("Last-Modified", lastUpdate.getTime());
        }

        Sort sort = new Sort(Sort.Direction.ASC, "lastUpdated");
        return new ModelAndView(new PersonRatingAtomFeedView(personRatingRepository), "personRatings", personRatingRepository.findAll(sort));
    }
}
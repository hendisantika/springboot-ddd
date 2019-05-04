package com.hendisantika.springbootddd.creditagency.controller;

import com.hendisantika.springbootddd.creditagency.repository.PersonRatingRepository;
import org.springframework.web.servlet.view.feed.AbstractAtomFeedView;

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
}

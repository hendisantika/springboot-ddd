package com.hendisantika.springbootddd.creditagency.controller;

import com.hendisantika.springbootddd.creditagency.model.PersonRating;
import com.hendisantika.springbootddd.creditagency.repository.PersonRatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ddd
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-04
 * Time: 08:50
 */
@RestController
@RequestMapping("rating/rest")
public class PersonRatingRestController {
    private PersonRatingRepository personRatingRepository;

    @Autowired
    public PersonRatingRestController(PersonRatingRepository personRatingRepository) {
        this.personRatingRepository = personRatingRepository;
    }

    @GetMapping("/{ratingId}")
    public PersonRating index(Model model, @PathVariable Long ratingId) {
        return personRatingRepository.findById(ratingId).get();
    }
}
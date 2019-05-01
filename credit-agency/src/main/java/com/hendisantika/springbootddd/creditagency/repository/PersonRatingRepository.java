package com.hendisantika.springbootddd.creditagency.repository;

import com.hendisantika.springbootddd.creditagency.model.PersonRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ddd
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-02
 * Time: 06:25
 */
public interface PersonRatingRepository extends JpaRepository<PersonRating, Long> {
    @Query("SELECT max(pr.lastUpdated) FROM PersonRating pr")
    Date lastUpdate();

}
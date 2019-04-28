package com.hendisantika.creditsales.repository;

import com.hendisantika.creditsales.model.household.Household;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ddd
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-04-29
 * Time: 04:30
 */
public interface HouseholdRepository extends JpaRepository<Household, Long> {
    Household findByApplicationNumber(String applicationNumber);
}
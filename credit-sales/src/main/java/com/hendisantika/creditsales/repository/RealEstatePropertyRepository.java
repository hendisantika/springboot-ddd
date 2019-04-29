package com.hendisantika.creditsales.repository;

import com.hendisantika.creditsales.model.realEstate.RealEstateProperty;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ddd
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-04-30
 * Time: 06:33
 */
public interface RealEstatePropertyRepository extends JpaRepository<RealEstateProperty, Long> {
    RealEstateProperty findByApplicationNumber(String applicationNumber);
}
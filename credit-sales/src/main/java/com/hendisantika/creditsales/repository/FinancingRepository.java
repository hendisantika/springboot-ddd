package com.hendisantika.creditsales.repository;

import com.hendisantika.creditsales.model.financing.Financing;
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
public interface FinancingRepository extends JpaRepository<Financing, Long> {
    Financing findByApplicationNumber(String applicationNumber);
}
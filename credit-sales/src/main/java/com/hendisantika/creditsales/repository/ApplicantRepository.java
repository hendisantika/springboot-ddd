package com.hendisantika.creditsales.repository;

import com.hendisantika.creditsales.model.applicant.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-ddd
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-04-29
 * Time: 04:29
 */
public interface ApplicantRepository extends JpaRepository<Applicant, Long> {
    Applicant findByApplicationNumberAndApplicantNumber(String applicationNumber, String applicantNumber);

    List<Applicant> findByApplicationNumberOrderByApplicantNumber(String applicationNumber);
}
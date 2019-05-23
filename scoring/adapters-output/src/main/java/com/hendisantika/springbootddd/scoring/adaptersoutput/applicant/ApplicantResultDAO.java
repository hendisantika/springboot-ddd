package com.hendisantika.springbootddd.scoring.adaptersoutput.applicant;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : adapters-output
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-24
 * Time: 05:34
 */
public interface ApplicantResultDAO extends JpaRepository<ApplicantResultProjection, Long> {
    ApplicantResultProjection findByApplicationNumber(String applicationNumber);

    ApplicantResultProjection findByPersonId(String personId);

}
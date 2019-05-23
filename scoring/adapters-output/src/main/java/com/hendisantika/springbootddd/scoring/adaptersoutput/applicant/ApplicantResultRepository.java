package com.hendisantika.springbootddd.scoring.adaptersoutput.applicant;

/**
 * Created by IntelliJ IDEA.
 * Project : adapters-output
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-24
 * Time: 05:33
 */
public interface ApplicantResultRepository {
    void save(ApplicantAggregate applicantAggregate);

    ApplicantResultProjection retrieve(ApplicationNumber applicationNumber);

    ApplicantResultProjection retrieve(PersonId personId);
}
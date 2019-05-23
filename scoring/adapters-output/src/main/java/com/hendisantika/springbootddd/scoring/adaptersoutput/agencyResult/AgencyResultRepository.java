package com.hendisantika.springbootddd.scoring.adaptersoutput.agencyResult;

/**
 * Created by IntelliJ IDEA.
 * Project : adapters-output
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-24
 * Time: 05:31
 */
public interface AgencyResultRepository {
    void save(AgencyResultAggregate agencyResultAggregate);

    AgencyResultProjection retrieve(PersonId personId);
}
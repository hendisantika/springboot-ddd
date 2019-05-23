package com.hendisantika.springbootddd.scoring.adaptersoutput.agencyResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by IntelliJ IDEA.
 * Project : adapters-output
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-24
 * Time: 05:32
 */
@Component
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class AgencyResultJPARepository implements AgencyResultRepository {

    private com.hendisantika.springbootddd.scoring.agencyResult.AgencyResultDAO dao;

    @Autowired
    public AgencyResultJPARepository(com.hendisantika.springbootddd.scoring.agencyResult.AgencyResultDAO dao) {
        this.dao = dao;
    }

    @Override
    public void save(AgencyResultAggregate agencyResultAggregate) {
        AgencyResultProjection agencyResultProjection = new AgencyResultProjection();
        agencyResultProjection.setNoGoPresent(!agencyResultAggregate.isAcceptable());
        agencyResultProjection.setPersonId(agencyResultAggregate.getAgencyResultRootEntity().id.toString());
        agencyResultProjection.setPoints(agencyResultAggregate.calculateScoringPoints());
        dao.save(agencyResultProjection);

    }

    @Override
    public AgencyResultProjection retrieve(PersonId personId) {
        return dao.findByPersonId(personId.toString());
    }
}
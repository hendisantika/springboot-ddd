package com.hendisantika.springbootddd.scoring.agencyResult;

import com.hendisantika.springbootddd.scoring.adaptersoutput.agencyResult.AgencyResultProjection;
import org.springframework.data.jpa.repository.JpaRepository;

interface AgencyResultDAO extends JpaRepository<AgencyResultProjection, Long> {
    AgencyResultProjection findByPersonId(String personId);
}
package com.hendisantika.springbootddd.scoring.agencyResult;

import org.springframework.data.jpa.repository.JpaRepository;

interface AgencyResultDAO extends JpaRepository<AgencyResultProjection, Long> {
    AgencyResultProjection findByPersonId(String personId);
}
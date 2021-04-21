package com.spring.springrest.dao;

import com.spring.springrest.entities.OrganisationDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganisationDao extends JpaRepository<OrganisationDetails,Long> {


}

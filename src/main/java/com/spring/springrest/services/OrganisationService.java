package com.spring.springrest.services;

import com.spring.springrest.dto.OrganisationDTO;
import com.spring.springrest.entities.OrganisationDetails;

import java.util.List;

public interface OrganisationService {

    public List<OrganisationDTO> getOrganisationDetails();

    public OrganisationDTO addOrganisationDetails(OrganisationDTO organizationDto);
}
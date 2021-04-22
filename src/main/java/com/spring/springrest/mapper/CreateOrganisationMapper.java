package com.spring.springrest.mapper;

import com.spring.springrest.dto.OrganisationDTO;
import com.spring.springrest.entities.OrganisationDetails;
import com.spring.springrest.services.OrganisationService;
import org.springframework.stereotype.Component;

@Component
public class CreateOrganisationMapper {
   // private final OrganisationService organisationservice;

   /* public CreateOrganisationMapper(OrganisationService organisationservice) {
        this.organisationservice = organisationservice;
    }*/

    public OrganisationDetails OrganisationDtoToOrganisationDetails(OrganisationDTO organisationDto)
    {
        OrganisationDetails organisationdetails=new OrganisationDetails();
        organisationdetails.setOrganisationId(organisationDto.getOrganisationId());
        organisationdetails.setOrganisationName(organisationDto.getOrganisationName());
        return organisationdetails;


    }




}

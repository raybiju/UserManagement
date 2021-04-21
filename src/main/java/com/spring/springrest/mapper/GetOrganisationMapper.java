package com.spring.springrest.mapper;

import com.spring.springrest.dao.OrganisationDao;
import com.spring.springrest.dto.OrganisationDTO;
import com.spring.springrest.entities.OrganisationDetails;
import org.springframework.stereotype.Component;

@Component
public class GetOrganisationMapper {


    public OrganisationDTO getAllOrganisationDetails(OrganisationDetails organisationdetails)
    {
        OrganisationDTO organisationDto=new OrganisationDTO();
        organisationDto.setOrganisationId(organisationdetails.getOrganisationId());
        organisationDto.setOrganisationName(organisationdetails.getOrganisationName());
        return organisationDto;

    }

}

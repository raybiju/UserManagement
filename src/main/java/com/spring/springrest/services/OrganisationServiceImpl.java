package com.spring.springrest.services;

import com.spring.springrest.dao.OrganisationDao;
import com.spring.springrest.dto.OrganisationDTO;
import com.spring.springrest.entities.OrganisationDetails;
import com.spring.springrest.entities.UserDetails;
import com.spring.springrest.mapper.CreateOrganisationMapper;
import com.spring.springrest.mapper.GetOrganisationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrganisationServiceImpl implements OrganisationService {

    private final OrganisationDao organisationdao;
    private final CreateOrganisationMapper organisationmapper;
    private final GetOrganisationMapper getOrganisationMapper;

    public OrganisationServiceImpl(OrganisationDao organisationdao, CreateOrganisationMapper organisationmapper, GetOrganisationMapper getOrganisationMapper) {
        this.organisationdao = organisationdao;
        this.organisationmapper = organisationmapper;
        this.getOrganisationMapper = getOrganisationMapper;
    }
@Override
    public List<OrganisationDTO> getOrganisationDetails() {
        List<OrganisationDetails> organisationList = (List<OrganisationDetails>) organisationdao.findAll();
        return organisationList.stream().map(organisationdetails -> getOrganisationMapper.getAllOrganisationDetails(organisationdetails)).collect(Collectors.toList());
    }

@Override
    public OrganisationDTO addOrganisationDetails(OrganisationDTO organisationDto) {
        OrganisationDetails organisationdetails = null;

            organisationdetails = organisationmapper.OrganisationDtoToOrganisationDetails(organisationDto);
            organisationdao.save(organisationdetails);
            return organisationDto;


    }
}

package com.spring.springrest.dto;

import com.sun.istack.NotNull;
import org.springframework.stereotype.Component;

import java.util.UUID;
@Component
public class OrganisationDTO {
    private Long organisationId;
    @NotNull
    private String OrganisationName;


    public OrganisationDTO(Long organisationId, String organisationName) {
        this.organisationId = organisationId;
        OrganisationName = organisationName;
    }
    public OrganisationDTO()
    {

    }

    public Long getOrganisationId() {
        return organisationId;
    }

    public void setOrganisationId(Long organisationId) {
        this.organisationId = organisationId;
    }

    public String getOrganisationName() {
        return OrganisationName;
    }

    public void setOrganisationName(String organisationName) {
        OrganisationName = organisationName;
    }
}

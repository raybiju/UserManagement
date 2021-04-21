package com.spring.springrest.entities;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="organisation")
public class OrganisationDetails {

     @Id
     @GeneratedValue
     @Column(name = "organisationId" ,unique=true,nullable = false)
    private UUID organisationId;


     @Column(name ="organisationName" ,unique = true,nullable = false)
    private String organisationName;

   public OrganisationDetails(UUID organisationId, String organisationName) {

        this.organisationId = organisationId;
        this.organisationName = organisationName;
    }
    public OrganisationDetails()
    {

    }


    public UUID getOrganisationId() {
        return organisationId;
    }

    public void setOrganisationId(UUID organisationId) {
        this.organisationId = organisationId;
    }

    public String getOrganisationName() {
        return organisationName;
    }

    public void setOrganisationName(String organisationName) {
        this.organisationName = organisationName;
    }

    @Override
    public String toString() {
        return "OrganizationDetails{" +
                "organisation_id=" + organisationId +
                ", Organisation_name='" + organisationName + '\'' +
                '}';
    }
}

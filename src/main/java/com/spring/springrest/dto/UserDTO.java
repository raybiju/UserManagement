package com.spring.springrest.dto;

import com.spring.springrest.common.UserCurrentStatus;
import com.sun.istack.NotNull;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Enumerated;
import java.util.UUID;

@Validated
public class UserDTO {
    private UUID userid;
    @NotNull
    private UUID organisationId;


private String username;
private String address;
private boolean active;

@Enumerated
    private  UserCurrentStatus currentStatus;


    public UserDTO(UUID userid, UUID organisationId, String username, String address, boolean active, UserCurrentStatus currentStatus) {
        this.userid = userid;
        this.organisationId = organisationId;
        this.username = username;
        this.address = address;
        this.active = active;
        this.currentStatus = currentStatus;
    }
    public UserDTO(){

    }

    public UUID getUserid() {
        return userid;
    }

    public void setUserid(UUID userid) {
        this.userid = userid;
    }

    public UUID getOrganisationId() {
        return organisationId;
    }

    public void setOrganisationId(UUID organisationId) {
        this.organisationId = organisationId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public UserCurrentStatus getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(UserCurrentStatus currentStatus) {
        this.currentStatus = currentStatus;
    }
}


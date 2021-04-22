package com.spring.springrest.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name="userdetails1")
public class UserDetails {

    private Long organisationId;
    @Id
    @Column(name="userid",insertable=false,unique=true,nullable=false)
    private Long userid;

    @Column(name="username",nullable = false)
    private String username;

    @Column(name="address",nullable = false)
    private String address;

    public String getCurrentStatus() {
        return currentStatus;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Column(name="active",nullable=false)
    private boolean active;

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    @Column(name="currentStatus",nullable=false)
    private String currentStatus;



    public UserDetails(Long organisationId, Long userid, String username, String address, String currentStatus) {

        this.organisationId = organisationId;
        this.userid = userid;
        this.username = username;
        this.address = address;
        this.currentStatus = currentStatus;
    }
    public UserDetails()
    {

    }



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public java.lang.String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public Long getOrganisation_id() {
        return organisationId;
    }

    public void setOrganisation_id(Long organization_id) {
        this.organisationId = organization_id;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "organisation_id=" + organisationId +
                ", userid=" + userid +
                ", username='" + username + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

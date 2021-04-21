package com.spring.springrest.dao;

import com.spring.springrest.entities.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<UserDetails,Long> {

    //List<UserDetails> findAll(Long organisationId);
}

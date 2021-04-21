package com.spring.springrest.services;
import com.spring.springrest.dto.UserDTO;
import com.spring.springrest.entities.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    public List<UserDTO> getUserDetails(Long organisationId);
    public UserDTO addUserDetails(UserDTO userDto);
}

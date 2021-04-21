package com.spring.springrest.mapper;

import com.spring.springrest.common.UserCurrentStatus;
import com.spring.springrest.dao.UserDao;
import com.spring.springrest.dto.UserDTO;
import com.spring.springrest.entities.UserDetails;
import com.spring.springrest.services.UserService;
import org.springframework.stereotype.Component;

@Component
public class GetUserMapper {


    public UserDTO getAllUserDetails(UserDetails userdetails) {
        UserDTO userDto=new UserDTO();

        userDto.setUserid(userdetails.getUserid());
        userDto.setUsername(userdetails.getUsername());
        userDto.setAddress(userdetails.getAddress());
        userDto.setOrganisationId(userdetails.getOrganisation_id());
        userDto.setCurrentStatus(UserCurrentStatus.valueOf(userdetails.getCurrentStatus()));
        userDto.setActive(userdetails.isActive());
        return userDto;
}
}

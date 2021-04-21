package com.spring.springrest.mapper;
import com.spring.springrest.dto.UserDTO;
import com.spring.springrest.entities.UserDetails;
import com.spring.springrest.exception.ResourceNotFoundException;
import com.spring.springrest.services.UserService;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CreateUserMapper{

private final UserService userService;


    public CreateUserMapper(UserService userService) {
        this.userService = userService;
    }

    public UserDetails UserDtoToUser(UserDTO userDto) throws ResourceNotFoundException {
        UserDetails userdetails =new UserDetails();
        String status=userDto.getCurrentStatus().toString();
        userdetails.setUserid(userDto.getUserid());
        userdetails.setUsername(userDto.getUsername());
        userdetails.setAddress(userDto.getAddress());
        userdetails.setOrganisation_id(userDto.getOrganisationId());
        userdetails.setCurrentStatus(status);
        userdetails.setActive(userDto.isActive());
        return userdetails;





    }
}


package com.spring.springrest.services;
import com.spring.springrest.dao.UserDao;
import com.spring.springrest.dto.UserDTO;
import com.spring.springrest.entities.UserDetails;
import com.spring.springrest.exception.ResourceNotFoundException;
import com.spring.springrest.mapper.CreateUserMapper;
import com.spring.springrest.mapper.GetUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userdao;
    private final GetUserMapper getUserMapper;
    private final CreateUserMapper usermapper;

    public UserServiceImpl(UserDao userdao, GetUserMapper getUserMapper, CreateUserMapper usermapper) {
        this.userdao = userdao;
        this.getUserMapper = getUserMapper;
        this.usermapper = usermapper;
    }


    @Override
    public List<UserDTO> getUserDetails(Long organisationId) {

        List<UserDetails> usersList = (List<UserDetails>) userdao.findAllById(Collections.singleton(organisationId));
        return usersList.stream().map(userdetails -> getUserMapper.getAllUserDetails(userdetails)).collect(Collectors.toList());
    }


    @Override
    public UserDTO addUserDetails(UserDTO userDto) {
        UserDetails userdetails = null;
        try {
            userdetails = usermapper.UserDtoToUser(userDto);
            userdao.save(userdetails);


        } catch (ResourceNotFoundException e) {
            e.printStackTrace();
        }

        return userDto;
    }
}





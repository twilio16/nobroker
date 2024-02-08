package com.onbroker.service.impl;

import com.onbroker.entity.User;
import com.onbroker.payload.UserDto;
import com.onbroker.repository.UserRepository;
import com.onbroker.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private UserRepository userRepository;


    @Override
    public long CreateUser(UserDto userDto) {
        User user = mapToEntity(userDto);
        User savedUser= userRepository.save(user);
        return savedUser.getId();
    }

    User mapToEntity(UserDto userDto){
        User user = modelMapper.map(userDto, User.class);
        return user;
    }
}

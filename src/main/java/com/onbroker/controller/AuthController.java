package com.onbroker.controller;

import com.onbroker.payload.UserDto;
import com.onbroker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody UserDto userDto){
        long userId = userService.CreateUser(userDto);
        return new ResponseEntity<>("User is created $ user id is: "+userId, HttpStatus.CREATED);

    }
}

package com.example.interviewbitclone.controllers;

import com.example.interviewbitclone.dto.ResponseDto;
import com.example.interviewbitclone.models.User;
import com.example.interviewbitclone.services.UserService;
import com.example.interviewbitclone.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(Constants.USERS_END_POINT)
public class UserController {

    public UserService userService;

    @Autowired
    UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/{id}")
    public ResponseDto<User> getUser(@PathVariable(name = "id") UUID id){
        User serviceResponse = userService.getUser(id);

        if(serviceResponse == null){
            return new ResponseDto(HttpStatus.FOUND, serviceResponse);
        }

        return new ResponseDto(HttpStatus.FOUND, userService.getUser(id));
    }
}

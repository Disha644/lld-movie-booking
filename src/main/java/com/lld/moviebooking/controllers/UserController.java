package com.lld.moviebooking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lld.moviebooking.model.RegisteredUser;
import com.lld.moviebooking.model.User;
import com.lld.moviebooking.provider.UserDataProvider;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserDataProvider userDataProvider;
    
    @PostMapping("/register")
    public RegisteredUser register(@RequestBody User user) {
        return userDataProvider.createUser(user.getUserName(), user.getEmail(), user.getPassword(), 
        		user.getFirstName(), user.getLastName(), user.getGender());
    }
    
    /*public RegisteredUser login(String userName, String password) {
        return null;
    }

    public boolean resetPassword(String newPassword, String oldPassword) {
        return true;
    }*/
}

package com.lld.moviebooking.model;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class User {
    protected UUID id;
    protected String userName;
    protected String email;
    protected String password;
    protected String firstName;
    protected String lastName;
    protected Gender gender;

    protected User() {}
    protected User(String userName, String email, String password, 
            String firstName, String lastName, Gender gender) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }
   
}
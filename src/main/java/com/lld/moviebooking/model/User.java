package com.lld.moviebooking.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class User {
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int id;
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
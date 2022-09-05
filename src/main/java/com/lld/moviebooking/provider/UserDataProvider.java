package com.lld.moviebooking.provider;

import com.lld.moviebooking.model.Gender;
import com.lld.moviebooking.model.RegisteredUser;

public interface UserDataProvider {

    public RegisteredUser createUser(String userName, String email, String password, 
        String firstName, String lastName, Gender gender);
}
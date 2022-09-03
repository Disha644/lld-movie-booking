package com.lld.moviebooking.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter
@NoArgsConstructor
public class RegisteredUser extends User {

    public RegisteredUser(String userName, String email, String password,
            String firstName, String lastName, Gender gender) {
        super(userName, email, password, firstName, lastName, gender);
    }  

    public boolean resetPassword(String newPassword, String oldPassword) {
        return true;
    }

    public RegisteredUser login(String userName, String password) {
        return null;
    }
}

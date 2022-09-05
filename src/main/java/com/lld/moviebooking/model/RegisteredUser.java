package com.lld.moviebooking.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter
@NoArgsConstructor
public class RegisteredUser extends User {

    List<Ticket> bookingHistory;

    public RegisteredUser(String userName, String email, String password,
            String firstName, String lastName, Gender gender) {
        super(userName, email, password, firstName, lastName, gender);
        this.bookingHistory = new ArrayList<>();
    }  
}

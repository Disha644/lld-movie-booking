package com.lld.moviebooking.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter
@NoArgsConstructor
public class TheaterAdmin extends User {
    private Theater theater;

    public TheaterAdmin(String userName, String email, String password,
            String firstName, String lastName, Gender gender, Theater theater) {
        super(userName, email, password, firstName, lastName, gender);
        this.theater = theater;
    }  
}

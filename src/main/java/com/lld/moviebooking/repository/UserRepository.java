package com.lld.moviebooking.repository;

import java.util.HashMap;
import java.util.Map;

import com.lld.moviebooking.exception.AlreadyExistsException;
import com.lld.moviebooking.model.Gender;
import com.lld.moviebooking.model.RegisteredUser;
import com.lld.moviebooking.provider.UserDataProvider;

/* maintaining in memory database for simplicity */
public class UserRepository implements UserDataProvider {
    private Map<Integer, RegisteredUser> users;
    
    public UserRepository() {
        this.users = new HashMap<>();
    }

    public RegisteredUser createUser(String userName, String email, String password, 
            String firstName, String lastName, Gender gender) {
        users.forEach((id, user) -> {
		if(user.getUserName().equals(userName) || user.getEmail().equals(email))
		    throw new AlreadyExistsException("This user is already registered");

		});
		RegisteredUser newUser = new RegisteredUser(userName, email, password, firstName, lastName, gender);
		users.put(newUser.getId(), newUser);
		return newUser;
    }
}

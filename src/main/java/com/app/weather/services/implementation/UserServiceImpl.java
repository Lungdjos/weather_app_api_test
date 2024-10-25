package com.app.weather.services.implementation;

import com.app.weather.model.User;
import com.app.weather.repositories.UserRepo;
import com.app.weather.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;


    /**
     * Register a new user
     * @param user
     * @return
     */
    @Override
    public User register(User user) {
        // Check if user already exists
        Optional<User> existingUser = Optional.ofNullable(userRepo.findUserByEmail(user.getEmail()));
        if (existingUser.isPresent()) {
            throw new RuntimeException("User already exists");
        }
        // Encode the password
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        // Save the user to the database
        return userRepo.save(user);
    }

    /**
     * Authenticate a user
     * @param email
     * @param password
     * @return
     */
    @Override
    public boolean authenticate(String email, String password) {
        Optional<User> user = Optional.ofNullable(userRepo.findUserByEmail(email));
        return user.filter(v -> passwordEncoder.matches(password, v.getPassword())).isPresent();
    }

}

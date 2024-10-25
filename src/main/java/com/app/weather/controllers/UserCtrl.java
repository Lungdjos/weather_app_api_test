package com.app.weather.controllers;

import com.app.weather.model.User;
import com.app.weather.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class UserCtrl {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        boolean isAuthenticated = userService.authenticate(user.getEmail(), user.getPassword());
        if (isAuthenticated) {
            return "Login Successful"; // You might want to return a JWT or user details instead
        }
        throw new RuntimeException("Invalid username or password");
    }
}

package com.app.weather.services;


import com.app.weather.model.User;
import org.springframework.stereotype.Service;


public interface UserService {
    User register(User user);
    boolean authenticate(String email, String password);
}

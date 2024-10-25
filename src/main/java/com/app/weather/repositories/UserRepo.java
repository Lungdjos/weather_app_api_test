package com.app.weather.repositories;

import com.app.weather.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findUserByEmail(String email);
}

package com.example.discoveryservice.repository;

import com.example.discoveryservice.model.User;

public interface UserRepository {
    User getUserByUsername(String username);
}

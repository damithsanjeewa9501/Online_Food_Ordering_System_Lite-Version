package com.foodapp.userservice.service;

import com.foodapp.userservice.model.User;
import com.foodapp.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User createUser(User user) {
        return repository.save(user);
    }

    public List<User> getAllUsers() {
        return repository.findAll();
    }
}
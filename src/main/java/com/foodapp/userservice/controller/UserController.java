package com.foodapp.userservice.controller;

import com.foodapp.userservice.model.User;
import com.foodapp.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return service.createUser(user);
    }

    @GetMapping
    public List<User> getUsers() {
        return service.getAllUsers();
    }

    @DeleteMapping
    public String deleteAllUsers() {
        service.deleteAllUsers();
        return "All users deleted successfully";
    }
}
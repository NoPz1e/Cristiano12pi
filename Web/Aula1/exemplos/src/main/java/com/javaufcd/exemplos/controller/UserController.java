package com.javaufcd.exemplos.controller;

import com.javaufcd.exemplos.model.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")

public class UserController {
    private final List<User> users = new ArrayList<>();

    @GetMapping
    public List<User> getAllUsers(){
        return users;
    }

    @PostMapping
    public User addUser (@RequestBody User user){
        users.add(user);
        return user;
    }
}

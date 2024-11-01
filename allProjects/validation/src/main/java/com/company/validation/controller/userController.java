package com.company.validation.controller;

import com.company.validation.entities.UserEntity;
import com.company.validation.repository.userRepo;
import com.company.validation.service.userService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class userController {


    @Autowired
    userService userservice;
    ;

    @GetMapping
    public ResponseEntity<List<UserEntity>> getAllUsers() {
        List<UserEntity> users = userservice.findAll();
        return ResponseEntity.ok(users);
    }

    @PostMapping
    public ResponseEntity<UserEntity> getAllUsers(@RequestBody @Valid UserEntity user) {
        userservice.save(user);
        return ResponseEntity.ok(user);
    }
}

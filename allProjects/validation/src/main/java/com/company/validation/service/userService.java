package com.company.validation.service;

import com.company.validation.entities.UserEntity;
import com.company.validation.repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {

    @Autowired
    userRepo userrepo;

    public List<UserEntity> findAll() {
        return userrepo.findAll();
    }

    public UserEntity save(UserEntity user) {
        return userrepo.save(user);
    }
}

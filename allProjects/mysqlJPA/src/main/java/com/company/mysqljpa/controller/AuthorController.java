package com.company.mysqljpa.controller;

import com.company.mysqljpa.entities.Author;
import com.company.mysqljpa.service.AuthorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Authors")
public class AuthorController {


    @Autowired
    AuthorService Authorservice;
    ;

    @GetMapping
    public ResponseEntity<List<Author>> getAllUsers() {
        List<Author> Authors = Authorservice.findAll();
        return ResponseEntity.ok(Authors);
    }

    @PostMapping
    public ResponseEntity<Author> getAllUsers(@RequestBody @Valid Author Author) {
        Authorservice.save(Author);
        return ResponseEntity.ok(Author);
    }
}

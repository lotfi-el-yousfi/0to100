package com.company.mysqljpa.service;

import com.company.mysqljpa.entities.Author;
import com.company.mysqljpa.repository.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    AuthorRepo authorrepo;

    public List<Author> findAll() {
        return authorrepo.findAll();
    }

    public Author save(Author user) {
        return authorrepo.save(user);
    }
}

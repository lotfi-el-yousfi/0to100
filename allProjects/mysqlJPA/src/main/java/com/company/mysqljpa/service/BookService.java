package com.company.mysqljpa.service;

import com.company.mysqljpa.entities.Book;
import com.company.mysqljpa.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepo authorrepo;

    public List<Book> findAll() {
        return authorrepo.findAll();
    }

    public Book save(Book user) {
        return authorrepo.save(user);
    }
}

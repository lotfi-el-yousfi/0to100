package com.company.mysqljpa.service;

import com.company.mysqljpa.entities.Book;
import com.company.mysqljpa.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepo bookRepo;

    public List<Book> findAll() {
        return bookRepo.findAll();
    }

    public Book save(Book user) {
        return bookRepo.save(user);
    }


    public List<Book> getBooksByAuthorName(String authorName) {
        return bookRepo.findBooksByAuthorName(authorName);

    }
}

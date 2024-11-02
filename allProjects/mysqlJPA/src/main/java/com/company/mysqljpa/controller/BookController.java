package com.company.mysqljpa.controller;

import com.company.mysqljpa.entities.Book;
import com.company.mysqljpa.service.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Books")
public class BookController {


    @Autowired
    BookService Bookservice;
    @Autowired
    private BookService bookService;
    ;

    @GetMapping
    public ResponseEntity<List<Book>> getAllUsers() {
        List<Book> Books = Bookservice.findAll();
        return ResponseEntity.ok(Books);
    }

    @GetMapping("/by-author")
    public List<Book> getBooksByAuthor(@RequestParam String authorName) {
        return Bookservice.getBooksByAuthorName(authorName);
    }

    @PostMapping
    public ResponseEntity<Book> getAllUsers(@RequestBody @Valid Book Book) {
        Bookservice.save(Book);
        return ResponseEntity.ok(Book);
    }
}

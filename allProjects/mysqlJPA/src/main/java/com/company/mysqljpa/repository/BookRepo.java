package com.company.mysqljpa.repository;

import com.company.mysqljpa.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Long> {
}

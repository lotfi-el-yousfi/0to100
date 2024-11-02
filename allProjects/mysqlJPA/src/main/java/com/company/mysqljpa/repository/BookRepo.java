package com.company.mysqljpa.repository;

import com.company.mysqljpa.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepo extends JpaRepository<Book, Long> {
    List<Book> findByAuthor_Name(String authorName);

    List<Book> findBooksByAuthorName(@Param("authorName") String authorName);

}

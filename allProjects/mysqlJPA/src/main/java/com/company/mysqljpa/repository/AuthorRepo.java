package com.company.mysqljpa.repository;

import com.company.mysqljpa.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author, Long> {
}

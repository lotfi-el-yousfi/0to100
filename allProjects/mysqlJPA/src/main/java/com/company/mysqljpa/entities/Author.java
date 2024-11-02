package com.company.mysqljpa.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Data
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Book> books;

}

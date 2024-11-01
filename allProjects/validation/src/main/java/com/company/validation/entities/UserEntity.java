package com.company.validation.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull(message = "Name cannot be null")
    private String name;

    @Size(min = 3, max = 15, message = "Username must be between 3 and 15 characters")
    private String username;

    @Email(message = "Email should be valid")
    private String email;

    @Min(value = 18, message = "Age should not be less than 18")
    private int age;

}

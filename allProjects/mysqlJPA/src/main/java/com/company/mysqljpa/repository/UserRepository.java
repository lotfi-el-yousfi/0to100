package com.company.mysqljpa.repository;

import com.company.mysqljpa.entities.AuthenticationRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AuthenticationRequest, Long> {
    AuthenticationRequest findByUsername(String username);
}

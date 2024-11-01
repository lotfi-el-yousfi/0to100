package com.company.validation.repository;

import com.company.validation.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

 public interface userRepo extends JpaRepository<UserEntity, Long> {
}

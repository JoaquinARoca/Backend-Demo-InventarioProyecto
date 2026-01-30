package com.example.main.repository;

import com.example.main.model.User;

import java.util.Optional;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByDeletedFalse(); // Only active users
    Optional<User> findByIdAndDeletedFalse(Long id);
    Optional<User> findByUsernameAndDeletedFalse(String username);
}

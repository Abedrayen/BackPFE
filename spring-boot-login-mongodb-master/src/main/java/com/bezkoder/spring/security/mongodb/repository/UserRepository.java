package com.bezkoder.spring.security.mongodb.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bezkoder.spring.security.mongodb.models.User;

public interface UserRepository extends MongoRepository<User, String> {
  Optional<User> findUserByUsername(String username);
  Optional<User> findUserById(String id);

  Boolean existsByUsername(String username);
  Boolean existsByEmail(String email);
}

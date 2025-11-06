package com.pietroluongo.letterboxd_with_friends.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pietroluongo.letterboxd_with_friends.model.User;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByUsername(String username);

}

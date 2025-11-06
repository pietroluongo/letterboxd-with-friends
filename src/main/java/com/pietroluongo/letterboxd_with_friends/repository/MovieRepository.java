package com.pietroluongo.letterboxd_with_friends.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pietroluongo.letterboxd_with_friends.model.Movie;

public interface MovieRepository extends MongoRepository<Movie, String> {
}
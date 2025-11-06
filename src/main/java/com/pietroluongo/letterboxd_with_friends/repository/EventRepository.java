package com.pietroluongo.letterboxd_with_friends.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pietroluongo.letterboxd_with_friends.model.Event;

public interface EventRepository extends MongoRepository<Event, String> {
}

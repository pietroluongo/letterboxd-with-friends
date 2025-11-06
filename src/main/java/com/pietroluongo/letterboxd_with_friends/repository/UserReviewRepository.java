package com.pietroluongo.letterboxd_with_friends.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.pietroluongo.letterboxd_with_friends.model.UserReview;

public interface UserReviewRepository extends MongoRepository<UserReview, ObjectId>, CustomUserReviewRepository {
}

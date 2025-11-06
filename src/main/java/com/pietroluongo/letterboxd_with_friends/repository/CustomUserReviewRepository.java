package com.pietroluongo.letterboxd_with_friends.repository;

import java.util.Optional;

import org.bson.types.ObjectId;

import com.pietroluongo.letterboxd_with_friends.model.UserReview;

public interface CustomUserReviewRepository {
    Optional<UserReview> findByIdWithInjectedMovieData(ObjectId id);
}

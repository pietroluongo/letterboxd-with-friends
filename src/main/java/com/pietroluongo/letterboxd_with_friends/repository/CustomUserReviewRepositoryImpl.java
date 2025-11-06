package com.pietroluongo.letterboxd_with_friends.repository;

import java.util.Optional;

import org.bson.types.ObjectId;

import com.pietroluongo.letterboxd_with_friends.model.UserReview;

public class CustomUserReviewRepositoryImpl implements CustomUserReviewRepository {
    @Override
    public Optional<UserReview> findByIdWithInjectedMovieData(ObjectId id) {
        return Optional.empty();
    }
}

package com.pietroluongo.letterboxd_with_friends.controller;

import org.bson.types.ObjectId;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pietroluongo.letterboxd_with_friends.model.UserReview;
import com.pietroluongo.letterboxd_with_friends.repository.UserReviewRepository;

@RestController
@RequestMapping("/userReviews")
public class UserReviewController {
    private final UserReviewRepository userReviewRepository;

    public UserReviewController(UserReviewRepository userReviewRepository) {
        this.userReviewRepository = userReviewRepository;
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserReview> getReviewWithMovie(@PathVariable String id) {
        var _id = new ObjectId(id);
        return userReviewRepository.findByIdWithInjectedMovieData(_id).map(ResponseEntity::ok)
                .orElse(ResponseEntity.ok().build());
    }

}

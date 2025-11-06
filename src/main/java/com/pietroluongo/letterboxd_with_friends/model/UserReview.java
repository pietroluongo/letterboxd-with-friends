package com.pietroluongo.letterboxd_with_friends.model;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Document(collection = "userreviews")
public class UserReview {
    @Id
    ObjectId id;

    @Getter
    @Setter
    float score;

    @Getter
    @Setter
    @NotNull
    ObjectId movie;

    @Getter
    @Setter
    String content;

    @Getter
    @Setter
    @NotNull
    Date date;

    @Getter
    @Setter
    @NotNull
    ObjectId user;
}

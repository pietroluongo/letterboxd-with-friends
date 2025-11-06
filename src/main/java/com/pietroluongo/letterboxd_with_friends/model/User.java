package com.pietroluongo.letterboxd_with_friends.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Document(collection = "users")
public class User {
    @Id
    String id;

    @Getter
    @Setter
    @NotBlank
    String name;

    @Indexed(unique = true)
    @Getter
    @Setter
    @NotBlank
    String email;

    @Setter
    @NotBlank
    String password;

    @Indexed(unique = true)
    @Getter
    @Setter
    @NotBlank
    String username;

    @Getter
    @Setter
    ObjectId[] events;

    @Getter
    @Setter
    @Indexed(unique = true, name = "letterboxdId_1", direction = IndexDirection.ASCENDING)
    String letterboxdId;

    @Getter
    @Setter
    ObjectId[] reviews;

}
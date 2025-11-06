package com.pietroluongo.letterboxd_with_friends.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Document
public class Group {
    @Id
    ObjectId id;

    @Getter
    @Setter
    @NotBlank
    String name;

    @Getter
    @Setter
    ObjectId[] members;

    @Getter
    @Setter
    ObjectId[] events;

}

package com.pietroluongo.letterboxd_with_friends.model;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Document
public class Event {

    @Id
    @Getter
    ObjectId id;

    @Getter
    @Setter
    @NotBlank
    String name;

    @Getter
    @Setter
    ObjectId[] users;

    @Getter
    @Setter
    @NotNull
    Date date;
}

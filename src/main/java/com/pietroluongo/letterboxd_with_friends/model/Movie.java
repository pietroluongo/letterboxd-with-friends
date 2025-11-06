package com.pietroluongo.letterboxd_with_friends.model;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Document(collection = "movies")
public class Movie {
    @Id
    ObjectId id;

    @Getter
    @Setter
    @NotBlank
    String name;

    @Getter
    @Setter
    @NotBlank
    String externalId;

    @Getter
    @Setter
    @NotNull
    Date releaseDate;

    @Getter
    @Setter
    ObjectId[] reviews;

}

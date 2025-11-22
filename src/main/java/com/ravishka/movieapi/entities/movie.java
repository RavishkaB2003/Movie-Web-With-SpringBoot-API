package com.ravishka.movieapi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Data
@Document(collection = "movies")
@AllArgsConstructor
@NoArgsConstructor
public class movie {

    @Id
    private ObjectId id;

    private String title;

    private String releaseDate;

    private String trailerLink;

    private List<String> genres;

    private List<String> backdrops;

    private String Poster;

    @DocumentReference
    private List<review> reviewsIds;
}

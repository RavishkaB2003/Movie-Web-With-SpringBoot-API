package com.ravishka.movieapi.repository;

import com.ravishka.movieapi.entities.movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<movie, ObjectId> {
}

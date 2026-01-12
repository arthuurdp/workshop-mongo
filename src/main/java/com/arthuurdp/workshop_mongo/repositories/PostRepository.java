package com.arthuurdp.workshop_mongo.repositories;

import com.arthuurdp.workshop_mongo.entities.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public abstract class PostRepository implements MongoRepository<Post, String> {
}

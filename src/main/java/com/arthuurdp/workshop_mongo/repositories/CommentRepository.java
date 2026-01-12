package com.arthuurdp.workshop_mongo.repositories;

import com.arthuurdp.workshop_mongo.entities.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

public abstract class CommentRepository implements MongoRepository<Comment, String> {
}

package com.arthuurdp.workshop_mongo.repositories;

import com.arthuurdp.workshop_mongo.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}

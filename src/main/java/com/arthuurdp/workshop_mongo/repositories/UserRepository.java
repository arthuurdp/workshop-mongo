package com.arthuurdp.workshop_mongo.repositories;

import com.arthuurdp.workshop_mongo.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public abstract class UserRepository implements MongoRepository<User, String> {

}

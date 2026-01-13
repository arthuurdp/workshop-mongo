package com.arthuurdp.workshop_mongo.services;

import com.arthuurdp.workshop_mongo.entities.User;
import com.arthuurdp.workshop_mongo.repositories.UserRepository;
import com.arthuurdp.workshop_mongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public void insert(User user) {
        repo.save(user);
    }

    public User findById(String id) {
        Optional<User> user = repo.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }
}

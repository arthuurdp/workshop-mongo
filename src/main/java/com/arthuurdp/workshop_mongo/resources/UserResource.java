package com.arthuurdp.workshop_mongo.resources;

import com.arthuurdp.workshop_mongo.entities.User;
import com.arthuurdp.workshop_mongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @Autowired
    private UserService service;

    @GetMapping
    public List<User> findAll() {
        return service.findAll();
    }

    @PostMapping
    public void insert(@RequestBody User user) {
        service.insert(user);
    }

    @GetMapping("/{id}")
    public void findById(@PathVariable String id) {
        service.findById(id);
    }
}

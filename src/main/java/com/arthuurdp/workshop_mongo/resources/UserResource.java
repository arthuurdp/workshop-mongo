package com.arthuurdp.workshop_mongo.resources;

import com.arthuurdp.workshop_mongo.entities.User;
import com.arthuurdp.workshop_mongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public void insert(@RequestBody User user) {
        service.insert(user);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable String id) {
        User user = service.findById(id);
        return ResponseEntity.ok().body(user);
    }
}

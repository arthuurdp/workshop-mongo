package com.arthuurdp.workshop_mongo.resources;

import com.arthuurdp.workshop_mongo.entities.User;
import com.arthuurdp.workshop_mongo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserResource {
    @Autowired
    private UserRepository userRepository;

}

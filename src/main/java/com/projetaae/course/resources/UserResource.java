package com.projetaae.course.resources;

import com.projetaae.course.entities.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Guilherme", "guilherme.moles@gamil.com", "11999209007", "password");

        return ResponseEntity.ok().body(u);
    }
}

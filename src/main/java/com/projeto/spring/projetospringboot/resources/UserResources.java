package com.projeto.spring.projetospringboot.resources;

import com.projeto.spring.projetospringboot.entities.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
    
    @GetMapping
    public ResponseEntity<User> findAll(){
        User us = new User(1l, "Júnior", "gmail.com", "9999", "1234");
        return ResponseEntity.ok().body(us);
    }  

}

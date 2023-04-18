package com.example.demospringjpa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @GetMapping("")
    public ResponseEntity<?> login(
            @RequestParam String username,
            @RequestParam String password,
            @RequestParam long phone
    ){

        return new ResponseEntity<>("Gia tri tra ve username: " + username + " password: " + password + " phone " + phone, HttpStatus.OK);
    }
    @PostMapping("")
    public ResponseEntity<?> login(
            @RequestParam String username,
            @RequestParam String password
    ){

        return new ResponseEntity<>("Post Gia tri tra ve username: " + username + " password: " + password, HttpStatus.OK);
    }

}

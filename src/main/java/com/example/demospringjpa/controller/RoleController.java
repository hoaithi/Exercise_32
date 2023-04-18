package com.example.demospringjpa.controller;

import com.example.demospringjpa.dto.RoleDTO;
import com.example.demospringjpa.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    RoleService roleService;
    @GetMapping("")
    public ResponseEntity<?> getRole(){
        List<RoleDTO> list = roleService.getRole();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}

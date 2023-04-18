package com.example.demospringjpa.controller;

import com.example.demospringjpa.dto.StatusDTO;
import com.example.demospringjpa.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/status")
public class StatusController {

    @Autowired
    private StatusService statusService;

    @GetMapping("")
    public ResponseEntity<?> getStatus(){
        List<StatusDTO> list =  statusService.getStatus();

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

}

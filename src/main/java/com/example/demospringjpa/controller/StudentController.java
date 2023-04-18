package com.example.demospringjpa.controller;

import com.example.demospringjpa.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    List<Student> studentList = new ArrayList<>();

    @GetMapping("")
    public ResponseEntity<?> createStudentParam(
            @RequestParam String name,
            @RequestParam int age
    ){

        Student student = new Student();
        student.setAge(age);
        student.setName(name);
        studentList.add(student);

        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }
    @GetMapping("/{name}/{age}")
    public ResponseEntity<?> createStudentPath(
            @PathVariable String name,
            @PathVariable int age
    ){
        Student student = new Student();
        student.setName(name);
        student.setAge(age);

        studentList.add(student);

        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }



    @PostMapping("")
    public ResponseEntity<?> createStudent(
            @RequestBody Student student
    ){
        studentList.add(student);
        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }


}

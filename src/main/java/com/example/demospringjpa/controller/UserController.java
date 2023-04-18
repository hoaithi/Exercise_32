package com.example.demospringjpa.controller;

import com.example.demospringjpa.dto.UserDTO;
import com.example.demospringjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/*
* khi spring boot chạy lên thì sẽ đọc các class có annotation sau :
* @Bean : Thường sử dụng khi spring boot quét ở tầng config class đó sẽ được khởi tạo và gán giá trị
@Component : dùng trực tiếp khi tạo ra class
@Service : dùng trực tiếp khi tạo ra class. cho dev biết class này có xử lý logic code
@Repository : dùng trực tiếp khi tạo ra class. cho dev biết class này có xử lý liên quan đến database
*  và lưu lên container dùng chung(IoC)
* nhưng khác nhau về bối cảnh sử dụng
* */


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("")
    public ResponseEntity<?> getUser() {
        List<UserDTO> list = userService.getUsers();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }


    // bước 1: mapping entity
    // bước 2: tạo controller định nghĩa đường dẫn
    // bước 3: tạo repository
    // bước 4: tạo services
}

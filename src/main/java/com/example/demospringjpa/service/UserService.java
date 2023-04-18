package com.example.demospringjpa.service;


import com.example.demospringjpa.dto.UserDTO;
import com.example.demospringjpa.entity.UserEntity;
import com.example.demospringjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    // lấy các class trên container dùng
    @Autowired
    private UserRepository userRepository;

    public List<UserDTO> getUsers() {

        List<UserEntity> list = userRepository.findAll();
        List<UserDTO> userDTOList = new ArrayList<>();

        for (UserEntity data : list) {
            UserDTO userDTO = new UserDTO();
            userDTO.setEmail(data.getEmail());
            userDTO.setFullname(data.getFullname());
            userDTO.setId(data.getId());
            userDTOList.add(userDTO);
        }
        return userDTOList;
    }
}

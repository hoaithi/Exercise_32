package com.example.demospringjpa.service;

import com.example.demospringjpa.dto.RoleDTO;
import com.example.demospringjpa.dto.UserDTO;
import com.example.demospringjpa.entity.RoleEntity;
import com.example.demospringjpa.entity.UserEntity;
import com.example.demospringjpa.repository.RoleRepository;
import com.example.demospringjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public List<RoleDTO> getRole() {

        List<RoleEntity> list = roleRepository.findAll();
        List<RoleDTO> roleDTOList = new ArrayList<>();

        for(RoleEntity item : list){
            RoleDTO roleDTO = new RoleDTO();
            roleDTO.setId(item.getId());
            roleDTO.setName(item.getName());
            roleDTOList.add(roleDTO);
        }
        return roleDTOList;
    }
}

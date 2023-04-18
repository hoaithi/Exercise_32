package com.example.demospringjpa.service;

import com.example.demospringjpa.dto.StatusDTO;
import com.example.demospringjpa.entity.StatusEntity;
import com.example.demospringjpa.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StatusService {

    @Autowired
    private StatusRepository statusRepository;

    public List<StatusDTO> getStatus(){
        List<StatusEntity> statusEntityList = statusRepository.findAll();
        List<StatusDTO> statusDTOList = new ArrayList<>();
        for (StatusEntity item:statusEntityList) {
            StatusDTO statusDTO = new StatusDTO();
            statusDTO.setId(item.getId());
            statusDTO.setName(item.getName());
            statusDTOList.add(statusDTO);
        }
        return statusDTOList;
    }
}

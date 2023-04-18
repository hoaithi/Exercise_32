package com.example.demospringjpa.repository;

import com.example.demospringjpa.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// tên entity, kiểu dữ liệu của khóa chính trong entity đó
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}

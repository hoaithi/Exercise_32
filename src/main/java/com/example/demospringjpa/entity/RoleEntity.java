package com.example.demospringjpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Set;

@Entity(name="roles")
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;
//
// Dữ liệu liên kết với nhau bởi entity nào bên bảng tham chiếu tới, giữ annotation @OneToMany(mappedBy = "tên biến giống bảng bên kia")
    @OneToMany(mappedBy = "roles")

    private Set<UserEntity> listUsers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<UserEntity> getListUsers() {
        return listUsers;
    }

    public void setListUsers(Set<UserEntity> listUsers) {
        this.listUsers = listUsers;
    }
}

package com.example.demospringjpa.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity(name="status")
public class StatusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "status")
    private Set<TaskEntity> listStatus;

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

    public Set<TaskEntity> getListStatus() {
        return listStatus;
    }

    public void setListStatus(Set<TaskEntity> listStatus) {
        this.listStatus = listStatus;
    }
}

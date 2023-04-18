package com.example.demospringjpa.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity(name="jobs")
public class JobEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name = "start_date")
    private Date start_date;

    @Column(name = "end_date")
    private Date end_date;
    @OneToMany(mappedBy = "job")
    private Set<TaskEntity> listTask;

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

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public Set<TaskEntity> getListTask() {
        return listTask;
    }

    public void setListTask(Set<TaskEntity> listTask) {
        this.listTask = listTask;
    }
}

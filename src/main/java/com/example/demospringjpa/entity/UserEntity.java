package com.example.demospringjpa.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity(name="users")
public class UserEntity {
    @Id// primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
    private int id;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "fullname")
    private String fullname;
    @Column(name = "avatar")
    private String avatar;

//    đang là khóa ngoại
//    @Column(name = "roleId")
//    private int roleId;
    // bảng nào giữ khóa ngoại luôn giữ hai annotation @ManyToOne
//    @JoinColumn(tên cột trong database)
    @ManyToOne
    @JoinColumn(name="role_id")
    private RoleEntity roles;

    @OneToMany(mappedBy = "user")
    private Set<TaskEntity> listTask;

    @Column(name = "phonenumber")
    private String phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public RoleEntity getRoles() {
        return roles;
    }

    public void setRoles(RoleEntity roles) {
        this.roles = roles;
    }

    public Set<TaskEntity> getListTask() {
        return listTask;
    }

    public void setListTask(Set<TaskEntity> listTask) {
        this.listTask = listTask;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

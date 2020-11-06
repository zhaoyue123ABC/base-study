package com.java.common.entity;

/**
 * 用户类
 */
public class User {

    //唯一标识
    private Long id;
    //用户名称
    private String username;
    //用户年龄
    private int age;
    //E-mail
    private String email;

    public User(String username) {
        this.username = username;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

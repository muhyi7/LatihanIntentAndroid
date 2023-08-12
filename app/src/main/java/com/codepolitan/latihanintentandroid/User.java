package com.codepolitan.latihanintentandroid;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String email;
    private int age;
    private boolean status;

    public User(String name, String email, int age, boolean status) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.status = status;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

package com.example.android1.todo;

/**
 * Created by Android1 on 8/17/2017.
 */

public class TypeUser {
    private String id, name, email, password, phone;

    TypeUser(String id, String name, String phone, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}

package com.example.pesolve.model;

public class UserModel {
    public UserModel(int id, String image_path, String fullname, String email, String password) {
        this.id = id;
        this.image_path = image_path;
        this.fullname = fullname;
        this.email = email;
        this.password = password;
    }

    String image_path, fullname, email, password;

    public String getImage_path() {
        return image_path;
    }

    public String getFullname() {
        return fullname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    int id;


}

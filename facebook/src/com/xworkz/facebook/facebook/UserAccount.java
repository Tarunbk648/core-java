package com.xworkz.facebook.facebook;

public class UserAccount {
    private int Id;
    private String userName;
    private String email;
    private String password;
    private String phoneNumber;
    private String gender;

    public void setId(int id) {
        this.Id=id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return this.Id;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getGender() {
        return this.gender;
    }
}

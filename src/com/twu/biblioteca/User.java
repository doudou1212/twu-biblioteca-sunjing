package com.twu.biblioteca;

/**
 * Created by sunjing on 4/23/16.
 */
public class User {
    private String name;
    private String libraryNumber;
    private String email;
    private String address;
    private String phoneNumber;
    private Boolean islogin = false;

    public User(String name, String libraryNumber, String email, String address, String phoneNumber) {
        this.name = name;
        this.libraryNumber = libraryNumber;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }

    public void setLibraryNumber(String libraryNumber) {
        this.libraryNumber = libraryNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Boolean getIslogin() {
        return islogin;
    }

    public void setIslogin(Boolean islogin) {
        this.islogin = islogin;
    }
}

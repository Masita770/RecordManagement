package com.example.demo.domain;

public class User {

    private String id;
    private String username;
    private String password;
    private String mailAddress;



    public String getId() {
        return id;
    }


    public void setId(String id) {

        this.id = id;
    }


    public String getPassword() {

        return password;
    }


    public void setPassword(String password) {

        this.password = password;
    }


    public String getMailAddress() {

        return mailAddress;
    }


    public void setMailAddress(String mailAddress) {

        this.mailAddress = mailAddress;
    }


    public String getUsername() {

        return username;
    }


    public void setUsername(String username) {

        this.username = username;
    }

}

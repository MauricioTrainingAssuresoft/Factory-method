package com.adapter;

public class User {
    private Email email;
    private UserInformation userInformation;

    public User(Email email, UserInformation userInformation) {
        this.email = email;
        this.userInformation = userInformation;
    }

    public Email getEmail() {
        return email;
    }

    public UserInformation getUserInformation() {
        return userInformation;
    }
}

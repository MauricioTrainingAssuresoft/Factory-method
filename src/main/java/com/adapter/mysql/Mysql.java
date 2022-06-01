package com.adapter.mysql;


import com.adapter.UserInformation;

public class Mysql implements IMysql {
    @Override
    public String save(UserInformation userInformation) {
        System.out.println("Saving into MySql");
        return userInformation.getLastName() + " " + userInformation.getLastName();
    }

    @Override
    public String read(UserInformation userInformation) {
        return "Reading user information from MySql";
    }
}

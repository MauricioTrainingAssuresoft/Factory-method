package com.adapter;

import com.adapter.adapter.IPersistence;
import com.adapter.adapter.Persistence;
import com.adapter.dynamoDB.DynamoDB;
import com.adapter.dynamoDB.IDynamoDB;
import com.adapter.mysql.IMysql;
import com.adapter.mysql.Mysql;

public class Main {
    public static void main(String[] args) {
        System.out.println("Adapter");
        UserInformation userInformation = new UserInformation();
        userInformation.setFirstName("Mauricio");
        userInformation.setLastName("Gamarra");
        userInformation.setAge(29);

        Email email = new Email("mauriciogamarra@gmail.com", "12345");
        User user = new User(email, userInformation);

        IMysql mysql = new Mysql();;
        IDynamoDB dynamoDB = new DynamoDB();

        IPersistence persistence = new Persistence(dynamoDB, mysql);
        persistence.persistenceInformation(user);
    }
}

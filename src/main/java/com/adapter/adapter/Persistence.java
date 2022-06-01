package com.adapter.adapter;

import com.adapter.User;
import com.adapter.dynamoDB.IDynamoDB;
import com.adapter.mysql.IMysql;

public class Persistence implements IPersistence{
    private IDynamoDB dynamoDB;
    private IMysql mysql;

    public Persistence(IDynamoDB dynamoDB, IMysql mysql) {
        this.dynamoDB = dynamoDB;
        this.mysql = mysql;
    }

    @Override
    public void persistenceInformation(User user) {
        System.out.println(mysql.save(user.getUserInformation()));
        System.out.println(dynamoDB.save(user));
    }
}

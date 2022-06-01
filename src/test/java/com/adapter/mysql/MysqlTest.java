package com.adapter.mysql;

import com.adapter.UserInformation;
import org.junit.Test;

import static org.junit.Assert.*;

public class MysqlTest {

    @Test
    public void saveReturnString() {
        IMysql mysql = new Mysql();
        UserInformation user = new UserInformation();
        String result = mysql.save(user);
        assertNotNull(result);
    }

    @Test
    public void readReturnString() {
        IMysql mysql = new Mysql();
        UserInformation user = new UserInformation();
        String result = mysql.read(user);
        assertEquals("Reading user information from MySql", result);
    }
}
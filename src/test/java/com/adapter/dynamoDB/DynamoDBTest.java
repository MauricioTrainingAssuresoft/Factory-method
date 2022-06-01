package com.adapter.dynamoDB;

import com.adapter.Email;
import com.adapter.User;
import com.adapter.UserInformation;
import org.junit.Test;

import static org.junit.Assert.*;

public class DynamoDBTest {

    @Test
    public void saveReturnString() {
        IDynamoDB dynamoDB = new DynamoDB();
        Email email = new Email("mauriciogamarra@gmail.com", "12345");
        UserInformation userInformation = new UserInformation();
        User user = new User(email, userInformation);
        String result = dynamoDB.save(user);
        assertNotNull(result);
    }

    @Test
    public void readReturnString() {
        IDynamoDB dynamoDB = new DynamoDB();
        Email email = new Email("mauriciogamarra@gmail.com", "12345");
        UserInformation userInformation = new UserInformation();
        User user = new User(email, userInformation);
        String result = dynamoDB.read(user);
        assertEquals("reading user information from DynamoDB", result);
    }
}
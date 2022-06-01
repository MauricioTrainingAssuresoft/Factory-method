package com.adapter.dynamoDB;

import com.adapter.Email;
import com.adapter.User;
import com.adapter.UserInformation;

public class DynamoDB implements IDynamoDB {
    @Override
    public String save(User user) {
        System.out.println("Saving into DynamoDB");
        return user.getUserInformation().getFirstName() + " " + user.getUserInformation().getLastName() +
                " " + user.getEmail().getUserName();
    }

    @Override
    public String read(User user) {
        return "reading user information from DynamoDB";
    }
}

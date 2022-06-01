package com.adapter.dynamoDB;

import com.adapter.Email;
import com.adapter.User;
import com.adapter.UserInformation;

public interface IDynamoDB {
    String save(User user);
    String read(User user);
}

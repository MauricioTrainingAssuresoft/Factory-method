package com.adapter.mysql;

import com.adapter.UserInformation;

public interface IMysql {
    String save(UserInformation userInformation);
    String read(UserInformation userInformation);
}

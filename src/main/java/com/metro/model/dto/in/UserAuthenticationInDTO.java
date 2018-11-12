package com.metro.model.dto.in;

import java.io.Serializable;

public class UserAuthenticationInDTO implements Serializable {

    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}

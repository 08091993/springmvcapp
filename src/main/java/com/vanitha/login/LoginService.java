package com.vanitha.login;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
    public boolean validateUser(String user, String password) {
        return user.equalsIgnoreCase("vanitha") && password.equals("dummy");
    }

}
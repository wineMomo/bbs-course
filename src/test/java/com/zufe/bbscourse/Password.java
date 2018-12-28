package com.zufe.bbscourse;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Password {

    public static void main(String[] args) {
        String password = "123456";
        System.out.print(BCrypt.hashpw(password, BCrypt.gensalt()));
    }
  String passwordBCrypt=  "$2a$10$LNMv21LP3X11MsBq4dBQDeiK8ObrvDR8WJXJSPLyA6AZjhaAeFYfK";
}

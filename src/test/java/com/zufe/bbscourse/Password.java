package com.zufe.bbscourse;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Password {

    public static void main(String[] args) {
        //String password = "123456";
        //System.out.print(BCrypt.hashpw(password, BCrypt.gensalt()));

        int cnt = 0 ;
        for(int i=10,j=1;;i++,j--){
            cnt++;
            System.out.println(cnt);
        }
    }
//    String passwordBCrypt=  "$2a$10$LNMv21LP3X11MsBq4dBQDeiK8ObrvDR8WJXJSPLyA6AZjhaAeFYfK";
}

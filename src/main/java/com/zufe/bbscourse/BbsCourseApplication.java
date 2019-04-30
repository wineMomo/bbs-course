package com.zufe.bbscourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class BbsCourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(BbsCourseApplication.class, args);
    }

}


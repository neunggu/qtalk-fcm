package com.quack.talk.fcm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.quack.talk.*"})
public class QtalkFcmApplication {

    public static void main(String[] args) {
        SpringApplication.run(QtalkFcmApplication.class, args);
    }

}

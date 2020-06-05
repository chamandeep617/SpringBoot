package com.example.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AopApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AopApplication.class, args);

        Alien a = context.getBean(Alien.class);
        a.show();

//        Alien a1 = context.getBean(Alien.class);
//        a1.show();
    }

}

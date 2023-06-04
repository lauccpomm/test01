package com.example.test01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test01Application {

    public static void main(String[] args) {
        SpringApplication.run(Test01Application.class, args);
        System.out.println("123");
        System.out.println("this is hot-fix1111");
        System.out.println("this is master info");
        System.out.println("hot-fix commit");
    }

}

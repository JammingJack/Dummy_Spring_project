package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) throws IOException {

        SpringApplication.run(DemoApplication.class, args);
        ApplicationContext dc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        File f = new File("test.txt");
        f.createNewFile();
        System.out.println("ggg");
    }

}

package com.michael;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * Created by michael on 2017/4/23.
 */
@Configuration
@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class,args);
    }

}

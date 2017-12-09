package com;

import com.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot 应用启动类
 * Created by songyc on 2017/8/1.
 */
@SpringBootApplication
@EnableAutoConfiguration
public class Application {

    @Autowired
    private HelloWorldService helloWorldService;

    public static void main(String[] args) {
        // 程序启动入口
        SpringApplication.run(Application.class,args);
    }
}


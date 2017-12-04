package com.service;

import org.springframework.stereotype.Service;

/**
 * Created by songyc on 2017/10/19.
 */
@Service("HelloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService {

    @Override
    public String sayHello(String name) {
        System.out.printf("name=%s %n",name);
        return "Hello World! " + name;
    }
}
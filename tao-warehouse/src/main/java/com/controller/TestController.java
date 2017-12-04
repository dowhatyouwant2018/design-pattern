package com.controller;

import com.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

/**
 * Created by songyc on 2017/10/19.
 */
@Controller
@RequestMapping("/test")
public class TestController {


    @GetMapping(value = "/")
    @ResponseBody
    public String selectPage() {

        return "Hessian Server: "+UUID.randomUUID().toString();
    }


}

package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

/**
 * Created by songyc on 2017/10/19.
 */
@Controller
@RequestMapping("/")
public class TestController {


    @GetMapping(value = "/test")
    @ResponseBody
    public String selectPage() {

        return "Hessian Server: "+UUID.randomUUID().toString();
    }


    @GetMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("hello","hello world!");
        return "/index";
    }


}

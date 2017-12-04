package com.michael.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by michael on 2017/4/23.
 */
@Controller
public class HelloVelocityController {



    @RequestMapping("/hello")
    public String index(Model model){
        model.addAttribute("name","michael");
        return "index";
    }
}

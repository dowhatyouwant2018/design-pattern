package com.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by songyc on 2017/10/27.
 */
@Controller
@RequestMapping("/")
public class MainController {

    @Value("${test.param}")
    private String param;

    @Value("${city}")
    private String city;

    @GetMapping(value = "/")
    @ResponseBody
    public String selectPage() {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String nowTime=sdf.format(new Date());

        // *.properties文件中的中文默认以ISO-8859-1方式编码，因此需要对中文内容进行重新编码
        try {
            param=new String(param.getBytes("GBK"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return String.format("Now=%s  Type=%s City=%s",nowTime,param,city);
    }

}

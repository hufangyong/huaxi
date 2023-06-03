package com.springboot05ems.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
/*用户进入小程序后获取基本信息*/
    @PostMapping("/hello")
    public String hello(String str){
        return "hello,"+str;
    }
}
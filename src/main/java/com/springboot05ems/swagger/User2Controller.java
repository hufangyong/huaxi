package com.springboot05ems.swagger;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User2Controller {

    @PostMapping("/hello")
    public String hello(String str){
        return "hello,"+str;
    }
}
package com.example.gittest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/hello")
    public String hello(){
        System.out.print("test");
        System.out.println("模拟冲突aaa");
        return "hello gitHub123";
    }
}

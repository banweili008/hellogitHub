package com.example.gittest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/hello")
    public String hello(){
        System.out.print("test");
        System.out.print("test模拟冲突BBB");
        return "hello gitHub123";
    }
}

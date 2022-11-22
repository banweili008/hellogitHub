package com.example.gittest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/hello")
    public String hello(){
        System.out.print("test");
        System.out.println("branch commit");
        System.out.println("i am branch1");
	    System.out.println("fen zhi");
        return "hello gitHub123";
    }
}

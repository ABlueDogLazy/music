package com.example.musicproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DefaultController {
    @GetMapping
    public String sayHello(){
        return "欢迎来到springboot";
    }
}

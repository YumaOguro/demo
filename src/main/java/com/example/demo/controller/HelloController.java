package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.annotation.RetentionPolicy;

@Controller
public class HelloController {
    @GetMapping
    public String getHello() {
        return "hello";
    }
}

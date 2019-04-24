package com.tw.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/")
    public String home() {
        return "This is homepage!";
    }

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
}

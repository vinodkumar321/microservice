package com.javatpoint.microservice2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping(path="hello" , method = RequestMethod.GET)
    public String helloWorld() {
        return "Hello World!";
    }
}

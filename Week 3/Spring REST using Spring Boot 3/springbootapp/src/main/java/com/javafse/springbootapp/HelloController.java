package com.javafse.springbootapp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {

    /*
        Mapping GET request to /hello
        Returns a simple greeting message
    */
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }    
}

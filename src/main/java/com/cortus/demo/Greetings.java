package com.cortus.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greetings {

   // private static final String template = "Hello, %s!";


    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return "Hello";
    }
}

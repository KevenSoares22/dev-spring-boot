package com.example.mynewapp.mynewapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }


    @GetMapping("/work")
    public String getWorkValue(){ return "get 5k!!"; }

    @GetMapping("/fortune")
    public String getFortune() { return "This is your lucky month!!"; }
}

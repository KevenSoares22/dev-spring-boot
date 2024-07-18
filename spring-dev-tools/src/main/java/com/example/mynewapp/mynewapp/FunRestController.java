package com.example.mynewapp.mynewapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Value("${niceuser.name}")
    private String niceUserName;
    @Value("${team.name}")
    private String teamName;


    private Professional myProfessional;
    @Autowired
    public FunRestController(Professional theProfessional){
        myProfessional = theProfessional;
    }


    @GetMapping("/")
    public String sayHello(){
        return myProfessional.getDailyWorkout();
    }
    @GetMapping("/work")
    public String getWorkValue(){ return "get 5k!!" + teamName; }

    @GetMapping("/fortune")
    public String getFortune() { return "This is your lucky month!!" + niceUserName; }
}

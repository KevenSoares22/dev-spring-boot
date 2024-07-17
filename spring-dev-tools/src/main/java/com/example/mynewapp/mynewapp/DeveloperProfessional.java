package com.example.mynewapp.mynewapp;

import org.springframework.stereotype.Component;

@Component
public class DeveloperProfessional implements Professional{


    @Override
    public String getDailyWorkout() {
        return "Study Now!!!!";
    }
}

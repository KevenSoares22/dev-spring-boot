package com.example.mynewapp.mynewapp.commons;

import org.springframework.stereotype.Component;

@Component
public class DevopsProfessional implements Professional {


    @Override
    public String getDailyWorkout() {
        return "Create Now!!!!";
    }
}

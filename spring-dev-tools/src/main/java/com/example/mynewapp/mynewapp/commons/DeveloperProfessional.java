package com.example.mynewapp.mynewapp.commons;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

@Primary
public class DeveloperProfessional implements Professional {


    @Override
    public String getDailyWorkout() {
        return "Study Now!!!!";
    }
}

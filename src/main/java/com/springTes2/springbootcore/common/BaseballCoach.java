package com.springTes2.springbootcore.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

    @Override
    public String getDailyWorkout()
    {
        return "baseball training for 10 min";
    }
}

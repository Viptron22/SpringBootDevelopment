package com.springTes2.springbootcore.common;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{
    @Override
    public String getDailyWorkout()
    {
        return "Get 10 minutes of football dribbling drill";
    }
}

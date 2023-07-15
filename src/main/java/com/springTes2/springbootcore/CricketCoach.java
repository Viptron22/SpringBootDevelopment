package com.springTes2.springbootcore;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout()
    {
        return "get 15 minute of net practice";
    }
}

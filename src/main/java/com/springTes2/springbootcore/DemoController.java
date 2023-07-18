package com.springTes2.springbootcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    //Constructor injection
    @Autowired
    public DemoController(Coach newCoach)
    {
        myCoach=newCoach;
    }
       @GetMapping("/dailyWorkout")
       public String dailyWorkout()
       {
           return myCoach.getDailyWorkout();
       }
}

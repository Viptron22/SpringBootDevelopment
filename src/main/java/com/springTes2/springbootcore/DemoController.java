package com.springTes2.springbootcore;

import com.springTes2.springbootcore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    //Constructor injection
    //changes in branch
    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach newCoach)
    {
        myCoach=newCoach;
    }
       @GetMapping("/dailyWorkout")
       public String dailyWorkout()
       {
           return myCoach.getDailyWorkout();
       }
}

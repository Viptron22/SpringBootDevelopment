package com.springTes2.springbootcore;

<<<<<<< HEAD
import com.springTes2.springbootcore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
=======
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> 0cb3351bb9edb3c079a876e7eff1b9bc615ea3a0
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
<<<<<<< HEAD

    //Constructor injection
    //changes in branch
    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach newCoach)
=======
    @Autowired
    public DemoController(Coach newCoach)
>>>>>>> 0cb3351bb9edb3c079a876e7eff1b9bc615ea3a0
    {
        myCoach=newCoach;
    }
       @GetMapping("/dailyWorkout")
       public String dailyWorkout()
       {
           return myCoach.getDailyWorkout();
       }
}

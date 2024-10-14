package com.springBoot.tutorials.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // expose the "/" return "Hello World"

    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    // expose a new endpoint for "Workout"
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Daily Workout";
    }

    // expose a new endpoint for "fortune"
    @GetMapping("/fortune")
    public  String getFortune() {
        return "Today is your lucky day.";
    }

}

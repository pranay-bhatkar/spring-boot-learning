package com.springBoot.tutorials.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // inject properties for : coach.name and team.name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // expose new endpoint for "teaminfo

    @GetMapping("/teaminfo")
    public  String getTeamInfo() {
        return "Coach : " + coachName + ", Team Name : " + teamName;
    }

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

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
}

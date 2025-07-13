package com.cognizant.spring_learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/hello")
public class HelloController {

    Logger logg = LoggerFactory.getLogger(HelloController.class);

    @GetMapping()
    public String sayHello()
    
    {
        logg.info("start");
        String message =   "Hello World!!";
        logg.info("end");
        return message;
    }

}

package com.jonathan.springboot.demo.firstapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FunRestController {
    @GetMapping("/")
        public String sayHello(){
        return "Hello world!";
    }

    @GetMapping("/workout")
            public String getDailyWorkout(){
        return "Run a hard ski";
            }

}

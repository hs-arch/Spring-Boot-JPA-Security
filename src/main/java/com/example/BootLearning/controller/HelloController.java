package com.example.BootLearning.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value="/ham", method= RequestMethod.GET)
    public String HelloWorld(){
        return ("Welcome to hamid learning !!!! Test change");
    }

}

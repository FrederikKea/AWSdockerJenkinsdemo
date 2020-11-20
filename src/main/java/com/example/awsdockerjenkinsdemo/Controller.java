package com.example.awsdockerjenkinsdemo;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    //TEST1

    @GetMapping("/")
    public String index (){
        return "index";
    }
}

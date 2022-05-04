package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class testContoller {
private int count =0

    @RequestMapping("/count/alternative")
    public String count(){
        count++;
        return "Count" +count;

    }
    @RequestMapping("/")
    public String hallo() {
        return "hallo Welt";
    }
}

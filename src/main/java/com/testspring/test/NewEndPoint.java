package com.testspring.test;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class NewEndPoint {
    
    @GetMapping("/")
    public String newEnd() {
        return "My name is billa";
    }
}

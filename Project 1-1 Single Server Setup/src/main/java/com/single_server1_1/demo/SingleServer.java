package com.single_server1_1.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class SingleServer {
   
    
    @GetMapping
    public String getMethodName() {
        return "This is a single server setup";
    }
}

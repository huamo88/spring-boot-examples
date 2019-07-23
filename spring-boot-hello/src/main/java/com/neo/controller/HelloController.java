package com.neo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
    @RequestMapping("/")
    public String index() {
    	String hello ="Hello Spring Boot 2.0!~!~!"; 
        return hello;
    }
}
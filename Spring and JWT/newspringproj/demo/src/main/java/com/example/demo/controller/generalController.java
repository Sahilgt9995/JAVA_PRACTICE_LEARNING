package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.generalService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/")
public class generalController {
    @Autowired
    private generalService gs;
    @GetMapping()
    public String generalMessage() {
       return gs.getWelcomeMessage();
    }
    
    
    
}

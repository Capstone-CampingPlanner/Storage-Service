package com.example.strg.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class ApiController {

    @PostMapping("/addDep")
    public String addDep(){
        return "";
    }
}

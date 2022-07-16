package com.example.cicd.controller;

import com.example.cicd.service.WelcomeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    private final WelcomeService welcomeService;

    public WelcomeController(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }

    @GetMapping(value = "/welcome")
    private String welcome(@RequestParam(required = false,defaultValue = "testing") String msg) {
        return welcomeService.welcome(msg);
    }
}

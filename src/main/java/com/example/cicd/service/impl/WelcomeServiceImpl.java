package com.example.cicd.service.impl;

import com.example.cicd.service.WelcomeService;
import org.springframework.stereotype.Service;

@Service
public class WelcomeServiceImpl implements WelcomeService {
    @Override
    public String welcome(String msg) {
        return msg+" welcome to cicd";
    }
}

package com.example.cicd;

import com.example.cicd.service.WelcomeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class CicdApplicationTests {

    @Autowired
    WelcomeService welcomeService;

    @Test
    void contextLoads() {
        String msg=welcomeService.welcome("sheik");
        assertEquals("sheik welcome to cicdl",msg);
    }

}

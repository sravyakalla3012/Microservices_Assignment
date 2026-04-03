package com.example.clientapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private UserClient userClient;

    @GetMapping("/testLogin")
    public String testLogin() {
        return userClient.login();
    }
}
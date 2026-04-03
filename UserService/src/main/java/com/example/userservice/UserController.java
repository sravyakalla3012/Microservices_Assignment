package com.example.userservice;

import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final String instanceId = UUID.randomUUID().toString();

    @GetMapping("/login")
    public String login() {
        return "Handled by instance: " + instanceId;
    }
}
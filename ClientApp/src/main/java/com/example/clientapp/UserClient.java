package com.example.clientapp;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "USER-SERVICE")
public interface UserClient {

    @GetMapping("/login")
    String login();
}
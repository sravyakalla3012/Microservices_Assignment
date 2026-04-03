package com.example.bankservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

    @GetMapping("/process")
    public String process() {
        return "Payment processed successfully by BankService";
    }
}

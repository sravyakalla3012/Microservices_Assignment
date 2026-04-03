package com.example.paymentservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Feign Client to call BankService
 */
@FeignClient(name = "bank-service", url = "http://localhost:8081")
public interface BankClient {

    /**
     * Calls the /process endpoint of BankService
     * @return String response from BankService
     */
    @GetMapping("/process")
    String processPayment();
}
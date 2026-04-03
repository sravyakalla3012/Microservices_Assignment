package com.example.paymentservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller to expose /pay endpoint
 */
@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    /**
     * Endpoint to call BankService via PaymentService
     * @return response from BankService
     */
    @GetMapping("/pay")
    public String pay() {
        return paymentService.pay();
    }
}
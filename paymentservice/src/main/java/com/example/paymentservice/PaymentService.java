package com.example.paymentservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private BankClient bankClient;

    public String pay() {
        return bankClient.processPayment();
    }
}
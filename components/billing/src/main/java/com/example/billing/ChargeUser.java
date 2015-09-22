package com.example.billing;

import com.example.payments.Gateway;

public class ChargeUser {
    private Gateway paymentGateway;

    public ChargeUser(Gateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void run(String userId, int paymentMonthlyAmount) {
        paymentGateway.createReocurringPayment(paymentMonthlyAmount);
    }
}

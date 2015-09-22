package com.example.payments;

public class RecurlyGateway implements Gateway {
    public boolean createReocurringPayment(int paymentMonthlyAmount){
        return true;
    }
}

package com.example.payments;

// Use of an interface here allows you to isolate
// the rest of the code from concrete implementations
public interface Gateway {
    public boolean createReocurringPayment(int paymentMonthlyAmount);
}

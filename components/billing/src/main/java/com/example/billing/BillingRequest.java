package com.example.billing;

public class BillingRequest {
    private final String userId;
    private final int amount;

    public BillingRequest(String userId, int amount) {
        this.userId = userId;
        this.amount = amount;
    }

    public String getUserId() {
        return userId;
    }

    public int getAmount() {
        return amount;
    }
}

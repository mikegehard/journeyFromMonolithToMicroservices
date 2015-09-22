package com.example.subscriptions;

import com.example.billing.Client;
import com.example.email.SendEmail;

public class CreateSubscription {

    private final Client billingClient;
    private final SendEmail emailSender;
    private final SubscriptionRepository subscriptions;

    public CreateSubscription(
            Client billingClient,
            SendEmail emailSender, SubscriptionRepository subscriptions) {
        this.billingClient = billingClient;
        this.emailSender = emailSender;
        this.subscriptions = subscriptions;
    }

    public void run(String userId, String packageId) {
        subscriptions.create(new Subscription(userId, packageId));
        billingClient.billUser(userId, 100);
        emailSender.run("me@example.com", "Subscription Created", "Some email body");
    }
}

package com.example.subscriptions;

import com.example.billing.BillingRequest;
import com.example.billing.Service;
import com.example.email.EmailMessage;
import com.example.email.SendEmail;

public class CreateSubscription {

    private final Service billingService;
    private final SendEmail emailSender;
    private final SubscriptionRepository subscriptions;

    public CreateSubscription(
            Service billingService,
            SendEmail emailSender, SubscriptionRepository subscriptions) {
        this.billingService = billingService;
        this.emailSender = emailSender;
        this.subscriptions = subscriptions;
    }

    public void run(String userId, String packageId) {
        subscriptions.create(new Subscription(userId, packageId));
        billingService.billUser(new BillingRequest(userId, 100));
        emailSender.run(new EmailMessage("me@example.com", "Subscription Created", "Some email body"));
    }
}

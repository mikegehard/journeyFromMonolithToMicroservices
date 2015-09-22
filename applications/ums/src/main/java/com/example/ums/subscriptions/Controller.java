package com.example.ums.subscriptions;

import com.example.billing.Service;
import com.example.email.SendEmail;
import com.example.subscriptions.CreateSubscription;
import com.example.subscriptions.Subscription;
import com.example.subscriptions.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
@RequestMapping("/subscriptions")
public class Controller {

    @Autowired
    SubscriptionRepository subscriptions;

    @Autowired
    Service billingService;

    @Autowired
    SendEmail emailSender;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Subscription> index() {
        return subscriptions.all();
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<String> create(@RequestBody Map<String, String> params) {

        new CreateSubscription(billingService, emailSender, subscriptions)
                .run(params.get("userId"), params.get("packageId"));

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}

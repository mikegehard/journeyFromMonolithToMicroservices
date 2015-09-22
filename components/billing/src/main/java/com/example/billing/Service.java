package com.example.billing;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


// Currently you can not attach Hystrix fallbacks to Feign clients
// so you need to wrap your client in a service to be able to
// attach fallbacks.
public class Service {

    private static final Logger logger = LoggerFactory.getLogger(Service.class);

    private final Client client;

    public Service(Client client) {
        this.client = client;
    }

    @HystrixCommand(fallbackMethod = "billUserFallback")
    public void billUser(BillingRequest billingRequest) {
        client.billUser(billingRequest);
    }

    public void billUserFallback(BillingRequest billingRequest) {
        // Here you could do anything you wanted as a fallback.
        logger.info("Calling Fallback..." + billingRequest);
    }
}

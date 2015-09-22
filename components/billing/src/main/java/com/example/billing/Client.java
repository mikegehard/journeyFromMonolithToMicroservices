package com.example.billing;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("billing")
public interface Client {
    @RequestMapping(method = RequestMethod.POST, value = "/reocurringPayment", consumes = "application/json")
    void billUser(BillingRequest request);
}

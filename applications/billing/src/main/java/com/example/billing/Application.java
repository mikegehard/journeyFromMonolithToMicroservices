package com.example.billing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    // Wire up the specific implementation of the payment gateway. Because this is an
    // interface, the rest of the code doesn't know anything about the concrete implementation.
    // This implementation can be switched out easily by the Spring IoC framework for testing so
    // that tests do not hit the actual gateway API.
    @Bean
    public com.example.payments.Gateway paymentGateway(){
        return new com.example.payments.RecurlyGateway();
    }
}

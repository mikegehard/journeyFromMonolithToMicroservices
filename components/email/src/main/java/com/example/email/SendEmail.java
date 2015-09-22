package com.example.email;


import org.springframework.amqp.rabbit.core.RabbitTemplate;

public class SendEmail {
    private final String queueName;
    private final RabbitTemplate rabbitTemplate;

    public SendEmail(String queueName, RabbitTemplate rabbitTemplate) {
        this.queueName = queueName;
        this.rabbitTemplate = rabbitTemplate;
    }

    public void run(EmailMessage message) {
        rabbitTemplate.convertAndSend(queueName, message);
    }
}

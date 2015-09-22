package com.example.email;

import org.springframework.messaging.handler.annotation.Payload;

public class EmailMessageReceiver {

    // There is a gotcha here about message formats. There might be messages
    // in the queue when this service is redeployed so if this interface changes
    // the messages in the queue may not be able to be deserialized.
    // Consider a serialization format that is sensitive to iterating on
    // versions like protocol buffers.
    public void process(@Payload EmailMessage message) {
        System.out.println("Received <" + message.getToAddress() + ">");
    }
}

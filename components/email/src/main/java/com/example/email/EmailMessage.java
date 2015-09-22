package com.example.email;

import java.io.Serializable;

public class EmailMessage implements Serializable {

    private final String toAddress;
    private final String subject;
    private final String body;

    public EmailMessage(String toAddress, String subject, String body) {

        this.toAddress = toAddress;
        this.subject = subject;
        this.body = body;
    }

    public String getToAddress() {
        return toAddress;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }
}

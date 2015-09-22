package com.example.subscriptions;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Subscription {

    @Id
    @GeneratedValue
    private Long id;

    private String userId;

    private String packageId;

    protected Subscription() {}

    public Subscription(String userId, String packageId) {
        this.userId = userId;
        this.packageId = packageId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }
}

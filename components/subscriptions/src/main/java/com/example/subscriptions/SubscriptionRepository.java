package com.example.subscriptions;


import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.HashMap;
import java.util.List;

public class SubscriptionRepository {
    private NamedParameterJdbcTemplate datasource;

    public SubscriptionRepository(NamedParameterJdbcTemplate datasource){

        this.datasource = datasource;
    }

    public List<Subscription> all() {
        return datasource.query("SELECT * FROM subscriptions;", (record, rowNumber) -> {
            return new Subscription(record.getString("userId"), record.getString("packageId"));
        });
    }

    public void create(Subscription subscription) {
        HashMap<String, Object> values = new HashMap<>();
        values.put("userId", subscription.getUserId());
        values.put("packageId", subscription.getPackageId());

        datasource.update("INSERT INTO subscriptions (userId, packageId) VALUES (:userId, :packageId);", values);
    }
}

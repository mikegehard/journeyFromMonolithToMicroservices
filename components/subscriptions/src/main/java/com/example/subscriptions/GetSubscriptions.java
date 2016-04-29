package com.example.subscriptions;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class GetSubscriptions {

    private SubscriptionRepository subscriptions;

    public GetSubscriptions(NamedParameterJdbcTemplate datasource) {
        this.subscriptions = new SubscriptionRepository(datasource);
    }

    public Iterable<Subscription> run() {
        return subscriptions.all();
    }
}

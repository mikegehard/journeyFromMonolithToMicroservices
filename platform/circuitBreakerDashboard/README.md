# Circuit Breaker dashboard

## Background

The circuit breaker pattern is useful when you have a network of services communicating. This pattern
allows the network to not completely fail when one of the services goes down or slows down.

When a service that is protected with a circuit breaker pattern goes down, default logic is run to
prevent a cascading failure.

## Viewing Circuit Breaker Dashboard

This can be found at [http://localhost:8762/hystrix](http://localhost:8762/hystrix) when the server is running.

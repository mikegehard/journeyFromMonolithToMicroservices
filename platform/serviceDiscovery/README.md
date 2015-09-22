# Service Discovery Service

## Background

Service discovery is an important pattern in microservice based architectures.
Service instances can come and go very quickly and manual configuration of
service URLs is very hard to scale.

This [Eureka](https://github.com/Netflix/eureka) based server will take in registrations of
services running in the ecosystem and also service requests from service clients for
locations of services.

It will leverage the [Spring Cloud Netflix](http://cloud.spring.io/spring-cloud-netflix/)
library to provide easy configuration of a Eureka server.

The service will run in [standalone mode](http://cloud.spring.io/spring-cloud-netflix/spring-cloud-netflix.html#_standalone_mode)
for now but can be run clustered to provide a more resilient service discovery fabric.

## Service Discovery Dashboard

This can be found at [http://localhost:8761/](http://localhost:8761/) when the server is running.

It may take a bit for services to register after the applications are booted.

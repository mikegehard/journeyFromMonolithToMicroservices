# Email service

## Background

This application is a POC email service. It will act as a
gateway to the email service of choice for. It uses
RabbitMQ as the asynchornous broker.

You will need to have a RabbitMq instance running locally to
get this service to work.

It does not need to register with Eureka because it will use the RabbitMq
queue as the point of integration.

## Prerequisites

You will need to have a RabbitMq instance running locally to
get this service to work.

If you are running on OSX and have homebrew installed, you can install
using: `brew install rabbitmq`.

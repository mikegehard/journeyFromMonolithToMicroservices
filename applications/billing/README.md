# Billing service

## Background

This application is a POC billing service. It will act as a
gateway to the billing provider of choice.

It will present a consistent consumer API regardless of billing provider
used. This will allow the billing provider to changed without
the rest of the application being affected by this change via Spring
dependency injection.

# RabbitMQ Java Sample

This repository contains a basic example of using RabbitMQ message broker in Java. It demonstrates how to set up and run a producer and a consumer that communicate through RabbitMQ.

## Requirements

- Docker

## Setup

1. First, ensure you have Docker installed on your system.

2. Run the RabbitMQ Docker container with the following command:

   ```bash
   docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.9-management
   
3. Access the RabbitMQ management console by visiting http://localhost:15672/ in your web browser.

4. Login to the console using the username guest and password guest (default credentials).

5. Create a new queue with the name "taste" and leave the parameters as default.

## Usage

1. Run both applications: rabbitMQ-publisher and rabbitMQ-consumer.

2. Go to http://localhost:8080/teste in your web browser.

3. Check the RabbitMQ-consumer console to verify the object you received.


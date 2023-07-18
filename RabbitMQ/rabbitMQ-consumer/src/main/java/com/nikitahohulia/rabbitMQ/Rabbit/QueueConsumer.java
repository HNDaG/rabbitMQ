package com.nikitahohulia.rabbitMQ.Rabbit;

import com.nikitahohulia.rabbitMQ.Entities.Order;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class QueueConsumer {

    @RabbitListener(queues = {"${queue.name}"})
    public void receive(@Payload Order fileBody) {
        System.out.println("Message " + fileBody);
    }

}
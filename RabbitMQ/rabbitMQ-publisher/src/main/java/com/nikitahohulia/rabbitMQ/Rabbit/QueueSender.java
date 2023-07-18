package com.nikitahohulia.rabbitMQ.Rabbit;

import com.nikitahohulia.rabbitMQ.Entities.Order;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QueueSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private Queue queue;

    public void send(Order order) {
        rabbitTemplate.convertAndSend(this.queue.getName(), order);
    }
}
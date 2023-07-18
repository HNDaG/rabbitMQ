package com.nikitahohulia.rabbitMQ.Controllers;

import com.nikitahohulia.rabbitMQ.Entities.Order;
import com.nikitahohulia.rabbitMQ.Rabbit.QueueSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/teste")
public class TesteController {

    @Autowired
    private QueueSender queueSender;

    @GetMapping
    public String send(){
        queueSender.send(new Order("4", "Nikita", Arrays.asList("Ball", "Bat", "Hat")));
        return "ok. done";
    }

}

package com.nikitahohulia.rabbitMQ.Entities;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Order {
    private String orderId;
    private String customerName;
    private List<String> items;

    // Constructors, getters, setters, and other methods
}

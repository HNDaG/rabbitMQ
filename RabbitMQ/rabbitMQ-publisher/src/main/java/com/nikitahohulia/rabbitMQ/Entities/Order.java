package com.nikitahohulia.rabbitMQ.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Order {
    private String orderId;
    private String customerName;
    private List<String> items;

    // Constructors, getters, setters, and other methods
}

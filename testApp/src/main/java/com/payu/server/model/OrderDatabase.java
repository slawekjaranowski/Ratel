package com.payu.server.model;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class OrderDatabase {
    private Map<Long, Order> orders = new HashMap<>();

    public void createOrder(Order order) {
        Long key = 1L;
        if (!orders.isEmpty())
            key = obtainLastKey();
        orders.put(key, order);

    }

    private Long obtainLastKey() {
        return orders.entrySet().stream().max(Comparator.comparingLong(Map.Entry::getKey)).get().getKey() + 1;
    }

    public Order get(Long id) {
        return orders.get(id);
    }
}

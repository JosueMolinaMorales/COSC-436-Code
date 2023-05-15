package org.example.kitchen;

import org.example.orders.OrderItem;

public interface KitchenObserver {
    void update(OrderItem order);
}

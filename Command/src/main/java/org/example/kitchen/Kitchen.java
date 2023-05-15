package org.example.kitchen;

import org.example.orders.OrderItem;

public class Kitchen implements KitchenObserver {
    @Override
    public void update(OrderItem order) {
        System.out.println("KITCHEN: has recieved order...   " + order.getItemNum());
    }
}

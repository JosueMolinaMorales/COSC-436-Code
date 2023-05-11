package org.example.orders;

import java.util.ArrayList;

public class Orders {
    private ArrayList<OrderItem> orderItems;

    public Orders() {
        orderItems = new ArrayList<>();
    }

    public void addOrderItem(OrderItem orderItem) {
        orderItems.add(orderItem);
    }

    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }
}

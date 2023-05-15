package org.example.orders;

import org.example.kitchen.KitchenObserver;

import java.util.ArrayList;

public class Orders {
    private final ArrayList<OrderItem> orderItems;
    private final ArrayList<KitchenObserver> observers;

    public Orders() {
        orderItems = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addOrderItem(OrderItem orderItem) {
        orderItems.add(orderItem);
        notifyObservers(orderItem);
    }

    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void addObserver(KitchenObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers(OrderItem orderItem) {
        for (KitchenObserver observer : observers) {
            observer.update(orderItem);
        }
    }
}

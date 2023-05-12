package org.example.tab;

import org.example.menu.Menu;
import org.example.menu.MenuItem;
import org.example.orders.OrderItem;
import org.example.orders.Orders;

public class Tab {
    private final Menu menu;
    private final Orders orders;

    public Tab(Menu menu, Orders orders) {
        this.menu = menu;
        this.orders = orders;
    }

    public void printTab() {
        double total = 0.0;
        System.out.println("| ------------ Tab ------------ |");
        System.out.println("| ID |   Description   |  Price |");
        for (OrderItem order : orders.getOrderItems()) {
            MenuItem menuItem = menu.getMenuItemById(order.getItemNum());
            System.out.printf("| %-3d| %-16s| %-7.2f|\n", menuItem.getItemNum(), menuItem.getDescription(),
                    menuItem.getPrice());
            total += menuItem.getPrice();
        }
        System.out.println("|----|-----------------|--------|");
        System.out.printf("Total: $%.2f\n", total);
    }
}

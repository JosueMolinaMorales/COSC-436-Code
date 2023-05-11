package org.example.commands;

import org.example.menu.Menu;
import org.example.menu.MenuItem;
import org.example.orders.Orders;

public class Aggregator {
    private Menu menu;
    private Orders orders;

    public Aggregator(Menu menu, Orders orders) {
        this.menu = menu;
        this.orders = orders;
    }

    public Aggregator() {
        this.menu = new Menu();
        // Add items to menu
        MenuItem[] menuItems = {
                new MenuItem(1, "Hamburger", 5.99),
                new MenuItem(2, "Cheeseburger", 6.99),
                new MenuItem(3, "Hot Dog", 4.99),
                new MenuItem(4, "Grilled Cheese", 3.99),
                new MenuItem(5, "French Fries", 2.99),
                new MenuItem(6, "Onion Rings", 3.99),
                new MenuItem(7, "Tater Tots", 3.99),
                new MenuItem(8, "Side Salad", 3.99),
                new MenuItem(9, "Caesar Salad", 4.99),
                new MenuItem(10, "Chef Salad", 5.99),
                new MenuItem(11, "Coke", 1.99),
                new MenuItem(12, "Diet Coke", 1.99),
                new MenuItem(13, "Sprite", 1.99),
                new MenuItem(14, "Dr. Pepper", 1.99),
        };
        for (MenuItem item : menuItems) {
            this.menu.addMenuItem(item);
        }
        this.orders = new Orders();
    }

    public Menu getMenu() {
        return this.menu;
    }

    public Orders getOrders() {
        return this.orders;
    }

}

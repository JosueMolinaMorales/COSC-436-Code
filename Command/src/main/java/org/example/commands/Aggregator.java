package org.example.commands;

import org.example.burger.ConcreteBurger;
import org.example.menu.Menu;
import org.example.menu.MenuItem;
import org.example.orders.Orders;

public class Aggregator {
    private final Menu menu;
    private final Orders orders;

    public Aggregator() {
        this.menu = new Menu();
        // Add items to menu
        MenuItem[] menuItems = {
                new MenuItem(MenuItem.getNextItemNum(), "Hamburger", 5.99),
                new MenuItem(MenuItem.getNextItemNum(), "Cheeseburger", 6.99),
                new MenuItem(MenuItem.getNextItemNum(), "Hot Dog", 4.99),
                new MenuItem(MenuItem.getNextItemNum(), "Grilled Cheese", 3.99),
                new MenuItem(MenuItem.getNextItemNum(), "French Fries", 2.99),
                new MenuItem(MenuItem.getNextItemNum(), "Onion Rings", 3.99),
                new MenuItem(MenuItem.getNextItemNum(), "Tater Tots", 3.99),
                new MenuItem(MenuItem.getNextItemNum(), "Side Salad", 3.99),
                new MenuItem(MenuItem.getNextItemNum(), "Caesar Salad", 4.99),
                new MenuItem(MenuItem.getNextItemNum(), "Chef Salad", 5.99),
                new MenuItem(MenuItem.getNextItemNum(), "Coke", 1.99),
                new MenuItem(MenuItem.getNextItemNum(), "Diet Coke", 1.99),
                new MenuItem(MenuItem.getNextItemNum(), "Sprite", 1.99),
                new MenuItem(MenuItem.getNextItemNum(), "Dr. Pepper", 1.99),
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

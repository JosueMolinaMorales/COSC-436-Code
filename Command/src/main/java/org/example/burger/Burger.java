package org.example.burger;

import org.example.menu.MenuItem;

public abstract class Burger extends MenuItem {
    public Burger(int itemNum, String description, double price) {
        super(itemNum, description, price);
        setDisplay(false);
    }
}

package org.example.menu;

import java.util.ArrayList;
import java.util.HashMap;

public class Menu {
    private final HashMap<Integer, MenuItem> menuItems;

    public Menu() {
        menuItems = new HashMap<>();
    }

    public void addMenuItem(MenuItem menuItem) {
        menuItems.put(menuItem.getItemNum(), menuItem);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return new ArrayList<>(menuItems.values());
    }

    public MenuItem getMenuItemById(int id) {
        return this.menuItems.get(id);
    }

}

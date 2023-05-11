package org.example.menu;

public class MenuItem {
    private final int itemNum;
    private final String description;
    private final double price;

    public MenuItem(int itemNum, String description, double price) {
        this.itemNum = itemNum;
        this.description = description;
        this.price = price;
    }

    public int getItemNum() {
        return itemNum;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%d: %s - $%.2f", itemNum, description, price);
    }
}

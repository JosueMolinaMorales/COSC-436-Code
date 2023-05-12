package org.example.menu;

public class MenuItem {
    private static int nextItemNum = 1;
    private final int itemNum;
    private final String description;
    private final double price;
    private boolean display = true;

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

    public static int getNextItemNum() {
        return nextItemNum++;
    }

    public boolean getDisplay() {
        return display;
    }

    public void setDisplay(boolean display) {
        this.display = display;
    }
}

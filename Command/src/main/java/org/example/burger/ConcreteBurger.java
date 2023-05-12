package org.example.burger;

public class ConcreteBurger extends Burger {

    public ConcreteBurger(int itemNum, String description, double price) {
        super(itemNum, description, price);
    }

    @Override
    public String getDescription() {
        return "Burger";
    }

}

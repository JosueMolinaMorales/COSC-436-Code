package org.example.burger.ingredients;

import org.example.burger.Burger;
import org.example.burger.Decorator;

public class BaconIngredient extends Decorator {
    public BaconIngredient(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + " + Bacon";
    }

    @Override
    public double getPrice() {
        return 1.99 + burger.getPrice();
    }
}

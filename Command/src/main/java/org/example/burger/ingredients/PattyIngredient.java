package org.example.burger.ingredients;

import org.example.burger.Burger;
import org.example.burger.Decorator;

public class PattyIngredient extends Decorator {
    public PattyIngredient(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + " + Patty";
    }

    @Override
    public double getPrice() {
        return 4.99 + burger.getPrice();
    }
}

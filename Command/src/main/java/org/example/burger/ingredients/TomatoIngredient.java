package org.example.burger.ingredients;

import org.example.burger.Burger;
import org.example.burger.Decorator;

public class TomatoIngredient extends Decorator {
    public TomatoIngredient(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + " + Tomato";
    }

    @Override
    public double getPrice() {
        return 1.99 + burger.getPrice();
    }
}

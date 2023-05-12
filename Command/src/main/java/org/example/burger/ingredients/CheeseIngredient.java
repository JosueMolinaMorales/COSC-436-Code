package org.example.burger.ingredients;

import org.example.burger.Burger;
import org.example.burger.Decorator;

public class CheeseIngredient extends Decorator {
    public CheeseIngredient(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + " + Cheese";
    }

    @Override
    public double getPrice() {
        return .99 + burger.getPrice();
    }
}

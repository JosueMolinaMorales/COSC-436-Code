package org.example.burger.ingredients;

import org.example.burger.Burger;
import org.example.burger.Decorator;

public class LettuceIngredient extends Decorator {
    public LettuceIngredient(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + " + Lettuce";
    }

    @Override
    public double getPrice() {
        return .50 + burger.getPrice();
    }
}

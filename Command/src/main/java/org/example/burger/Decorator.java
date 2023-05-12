package org.example.burger;

public abstract class Decorator extends Burger {
    protected Burger burger;

    public Decorator(Burger burger) {
        super(burger.getItemNum(), burger.getDescription(), burger.getPrice());
        this.burger = burger;
    }

    abstract public String getDescription();
    abstract public double getPrice();
}

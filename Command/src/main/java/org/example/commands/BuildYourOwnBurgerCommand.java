package org.example.commands;

import org.example.burger.Burger;
import org.example.burger.ConcreteBurger;
import org.example.burger.ingredients.BaconIngredient;
import org.example.burger.ingredients.CheeseIngredient;
import org.example.burger.ingredients.LettuceIngredient;
import org.example.burger.ingredients.PattyIngredient;
import org.example.menu.MenuItem;
import org.example.orders.OrderItem;

import java.util.Scanner;

public class BuildYourOwnBurgerCommand implements Command {
    private final Aggregator aggregator;

    public BuildYourOwnBurgerCommand(Aggregator aggregator) {
        this.aggregator = aggregator;
    }

    public void execute() {
        Burger burger = new ConcreteBurger(MenuItem.getNextItemNum(), "Burger", 1.00);

        Scanner scan = new Scanner(System.in);
        System.out.print("Would you like to add a patty? (y/n) >>> ");
        String input = scan.nextLine();
        if (input.equals("y"))
            burger = new PattyIngredient(burger);
        System.out.print("Would you like to add bacon? (y/n) >>> ");
        input = scan.nextLine();
        if (input.equals("y"))
            burger = new BaconIngredient(burger);
        System.out.print("Would you like to add cheese? (y/n) >>> ");
        input = scan.nextLine();
        if (input.equals("y"))
            burger = new CheeseIngredient(burger);
        System.out.print("Would you like to add lettuce? (y/n) >>> ");
        input = scan.nextLine();
        if (input.equals("y"))
            burger = new LettuceIngredient(burger);
        System.out.print("Would you like to add tomato? (y/n) >>> ");
        input = scan.nextLine();
        if (input.equals("y"))
            burger = new LettuceIngredient(burger);

        aggregator.getOrders().addOrderItem(new OrderItem(burger.getItemNum()));
        aggregator.getMenu().addMenuItem(burger);
    }
}

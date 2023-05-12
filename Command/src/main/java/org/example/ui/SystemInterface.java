package org.example.ui;

import org.example.commands.Invoker;

public class SystemInterface {
    private static final Invoker invoker = new Invoker();

    public static void displayTab() {
        invoker.displayTab();
    }

    public static void displayMenu() {
        invoker.displayMenu();
    }

    public static void submitOrder() {
        invoker.submitOrder();
    }

    public static void buildYourOwnBurger() {
        invoker.buildYourOwnBurger();
    }
}

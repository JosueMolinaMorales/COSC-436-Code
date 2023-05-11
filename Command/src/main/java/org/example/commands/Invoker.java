package org.example.commands;

public class Invoker {
    private Aggregator aggregator;

    public Invoker() {
        this.aggregator = new Aggregator();
    }

    public void displayMenu() {
        PrintMenuCommand printMenuCommand = new PrintMenuCommand(aggregator);
        printMenuCommand.execute();
    }

    public void displayTab() {
        PrintTabCommand printTabCommand = new PrintTabCommand(aggregator);
        printTabCommand.execute();
    }

    public void submitOrder() {
        SubmitOrderCommand submitOrderCommand = new SubmitOrderCommand(aggregator);
        submitOrderCommand.execute();
    }
}

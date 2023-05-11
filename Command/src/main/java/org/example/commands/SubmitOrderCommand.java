package org.example.commands;

import org.example.orders.OrderItem;

import java.util.Scanner;

public class SubmitOrderCommand implements Command {
    private Aggregator aggregator;

    public SubmitOrderCommand(Aggregator aggregator) {
        this.aggregator = aggregator;
    }

    @Override
    public void execute() {
        boolean stopOrdering = false;
        while (!stopOrdering) {
            System.out.print("Enter item number to order, or 0 to stop ordering >>> ");
            int itemNumber = Integer.parseInt(new Scanner(System.in).nextLine());
            if (itemNumber == 0) {
                stopOrdering = true;
            } else {
                // Check if item number is valid
                if (itemNumber < 1 || itemNumber > this.aggregator.getMenu().getMenuItems().size()) {
                    System.out.println("Invalid item number");
                    continue;
                }
                this.aggregator.getOrders().addOrderItem(new OrderItem(itemNumber));
            }
        }
    }
}

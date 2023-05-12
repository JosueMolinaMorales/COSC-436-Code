package org.example.commands;

import org.example.menu.Menu;
import org.example.menu.MenuItem;

public class PrintMenuCommand implements Command {
    private final Aggregator aggregator;

    public PrintMenuCommand(Aggregator aggregator) {
        this.aggregator = aggregator;
    }

    @Override
    public void execute() {
        Menu menu = this.aggregator.getMenu();
        System.out.println("| ID |   Description  |  Price |");
        System.out.println("|----|----------------|--------|");
        for (MenuItem item : menu.getMenuItems()) {
            if (!item.getDisplay()) {
                continue;
            }
            System.out.printf("| %-3d| %-15s| %-6.2f|\n", item.getItemNum(), item.getDescription(), item.getPrice());
        }
        System.out.println("|----|----------------|--------|");
    }
}

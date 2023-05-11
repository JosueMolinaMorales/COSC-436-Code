package org.example.commands;

import org.example.tab.Tab;

public class PrintTabCommand implements Command {
    private Aggregator aggregator;

    public PrintTabCommand(Aggregator aggregator) {
        this.aggregator = aggregator;
    }

    @Override
    public void execute() {
        new Tab(this.aggregator.getMenu(), this.aggregator.getOrders()).printTab();
    }
}

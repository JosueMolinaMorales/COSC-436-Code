package org.example.ui;

import java.util.Scanner;

public class TextUI {
    public static void start() {
        int choice = 0;
        printWelcome();
        while (choice != 4) {
            System.out.println("--------------------------------------------------");
            System.out.println("|         What would you like to do?             |");
            System.out.println("|         1. Display menu                        |");
            System.out.println("|         2. Submit order                        |");
            System.out.println("|         3. Display tab                         |");
            System.out.println("|         4. Exit                                |");
            System.out.println("--------------------------------------------------");
            System.out.print(">>>>> ");
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            // Validate input is an int
            while (!input.matches("\\d+")) {
                System.out.println("Invalid input, please enter a number");
                input = scan.nextLine();
            }
            choice = Integer.parseInt(input);
            switch (choice) {
                case 1 -> SystemInterface.displayMenu();
                case 2 -> SystemInterface.submitOrder();
                case 3 -> SystemInterface.displayTab();
                case 4 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid input");
            }
        }
    }

    private static void printWelcome() {
        System.out.println("Welcome to the Automated Restaurant System!");
    }
}

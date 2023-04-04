package menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Fill menu.Menu Item
        Menu menu = fillMenu();
        String choice = displayMenu();

        switch (choice) {
            case "1" -> displayAllMenuItems(menu);
            case "2" -> displayAllAppetizers();
            case "3" -> displayAllMainDishes();
            case "4" -> displayAllDesserts();
            case "5" -> displayAllHeartyHealthyItems();
            case "6" -> displayAllItemsUnderPrice();
            case "7" -> addMenuItem();
            case "8" -> deleteMenuItem();
            default -> System.out.println(choice + " is not a valid entry");
        }
    }

    private static void deleteMenuItem() {
        // TODO
    }

    private static void addMenuItem() {
        // TODO
    }

    private static void displayAllMenuItems(Menu menu) {
        MenuIterator itr = menu.getAllItemIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next() + "\n");
        }
    }

    private static void displayAllAppetizers() {
        // TODO
    }

    private static void displayAllMainDishes() {
        // TODO
    }

    private static void displayAllDesserts() {
        // TODO
    }

    private static void displayAllHeartyHealthyItems() {
        // TODO
    }

    private static void displayAllItemsUnderPrice() {
        // TODO
    }

    private static Menu fillMenu() {
        Menu menu = new Menu();

        menu.add(new MenuItem("Pizza", MenuCategory.MainCourse, Menu.NOT_HEART_HEALTHY, 12.99f));
        menu.add(new MenuItem("Salad", MenuCategory.Appetizer, Menu.HEART_HEALTHY, 4.99f));
        menu.add(new MenuItem("Burger", MenuCategory.MainCourse, Menu.NOT_HEART_HEALTHY, 14.99f));
        menu.add(new MenuItem("Veggie Burger", MenuCategory.MainCourse, Menu.HEART_HEALTHY, 13.99f));
        menu.add(new MenuItem("Gelato", MenuCategory.Dessert, Menu.HEART_HEALTHY, 3.99f));
        menu.add(new MenuItem("Chicken Wings", MenuCategory.Appetizer, Menu.NOT_HEART_HEALTHY, 6.99f));

        return menu;
    }

    private static String displayMenu() {
        System.out.println("1 - Display all menu items");
        System.out.println("2 - Display all appetizers");
        System.out.println("3 - Display all main dishes");
        System.out.println("4 - Display all desserts");
        System.out.println("5 - Display all hearty healthy items");
        System.out.println("6 - Display all main dishes under a specified price");
        System.out.println("7 - Add menu item");
        System.out.println("8 - Remove menu item");
        System.out.print(">>>>> ");
        return new Scanner(System.in).nextLine();
    }
}

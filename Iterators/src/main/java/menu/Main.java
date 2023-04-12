package menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Fill menu.Menu Item
        Menu menu = fillMenu();
        String choice;
        do {
            choice = displayMenu();

            switch (choice) {
                case "1" -> displayAllMenuItems(menu);
                case "2" -> displayAllAppetizers(menu);
                case "3" -> displayAllMainDishes(menu);
                case "4" -> displayAllDesserts(menu);
                case "5" -> displayAllHeartyHealthyItems(menu);
                case "6" -> displayAllItemsUnderPrice(menu);
                case "7" -> addMenuItem(menu);
                case "8" -> deleteMenuItem(menu);
                default -> System.out.println(choice + " is not a valid entry");
            }
        } while (!choice.equals("q"));
    }

    private static void deleteMenuItem(Menu menu) {
        System.out.println("==================REMOVE MENU ITEM==================");
        MenuIterator itr = menu.getAllItemIterator();
        Scanner scanner = new Scanner(System.in);
        boolean deleteItem = false;
        while (itr.hasNext() && !deleteItem) {
            MenuItem item = itr.next();
            System.out.print("Would you like to delete: " + item.getName() + "? (Enter to skip; d to delete) >>>>> ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("d")) {
                menu.delete(itr);
                deleteItem = true;
            }
        }
    }

    private static void addMenuItem(Menu menu) {
        System.out.println("==================ADD MENU ITEM==================");
        String name = "";
        MenuCategory menuCategory = null;
        Scanner scanner = new Scanner(System.in);

        while (name.isEmpty()) {
            System.out.print("Enter a name for the menu item >>>>> ");
            name = scanner.nextLine();
        }

        float price = getFloatPrice();

        while (menuCategory == null) {
            System.out.println("What type is the menu item?");
            System.out.println("1. Appetizer");
            System.out.println("2. Main Dish");
            System.out.println("3. Dessert");
            System.out.print("Enter option >>>>> ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> menuCategory = MenuCategory.Appetizer;
                case "2" -> menuCategory = MenuCategory.MainCourse;
                case "3" -> menuCategory = MenuCategory.Dessert;
                default -> System.out.println("Please enter a valid choice");
            }
        }

        System.out.print("Is this item heart healthy? (Y/N) >>>>>> ");
        boolean heartHealthy = scanner.nextLine().equalsIgnoreCase("y");

        menu.add(new MenuItem(name, menuCategory, heartHealthy, price));
        System.out.println("Menu item added!");
    }

    private static void displayAllMenuItems(Menu menu) {
        System.out.println("==================DISPLAY ALL ITEMS==================");
        MenuIterator itr = menu.getAllItemIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next() + "\n");
        }
    }

    private static void displayAllAppetizers(Menu menu) {
        System.out.println("==================DISPLAY ALL APPETIZERS==================");
        MenuIterator itr = menu.getItemIterator(MenuCategory.Appetizer);
        while (itr.hasNext()) {
            System.out.println(itr.next() + "\n");
        }
    }

    private static void displayAllMainDishes(Menu menu) {
        System.out.println("==================DISPLAY ALL MAIN DISHES==================");
        MenuIterator itr = menu.getItemIterator(MenuCategory.MainCourse);
        while (itr.hasNext()) {
            System.out.println(itr.next() + "\n");
        }
    }

    private static void displayAllDesserts(Menu menu) {
        System.out.println("==================DISPLAY ALL DESSERTS==================");
        MenuIterator itr = menu.getItemIterator(MenuCategory.Dessert);
        while (itr.hasNext()) {
            System.out.println(itr.next() + "\n");
        }
    }

    private static void displayAllHeartyHealthyItems(Menu menu) {
        System.out.println("==================DISPLAY ALL HEALTHY ITEMS==================");
        MenuIterator itr = menu.getHeartHealthyIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next() + "\n");
        }
    }

    private static void displayAllItemsUnderPrice(Menu menu) {
        float price = getFloatPrice();
        MenuIterator itr = menu.getPriceIterator(price);
        System.out.println("==============MENU ITEMS UNDER $" + price + " ==============");
        while (itr.hasNext()) {
            System.out.println(itr.next() + "\n");
        }
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
        System.out.print("(q to quit) >>>>> ");
        return new Scanner(System.in).nextLine();
    }

    private static float getFloatPrice() {
        boolean validPrice = false;
        float price = 0;
        while (!validPrice) {
            try {
                System.out.print("Enter a price >>>>> ");
                String priceEntered = new Scanner(System.in).nextLine();
                price = Float.parseFloat(priceEntered);
                validPrice = true;
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter a number!");
            }
        }
        return price;
    }
}

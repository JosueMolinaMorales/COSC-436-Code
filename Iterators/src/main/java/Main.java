import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 - Display all menu items");
        System.out.println("2 - Display all appetizers");
        System.out.println("3 - Display all main dishes");
        System.out.println("4 - Display all desserts");
        System.out.println("5 - Display all hearty healthy items");
        System.out.println("6 - Display all main dishes under a specified price");
        System.out.println("7 - Add menu item");
        System.out.println("8 - Remove menu item");
        System.out.print(">>>>> ");
        String choice = new Scanner(System.in).nextLine();

        switch (choice) {
            case "1": break;
            case "2": break;
            case "3": break;
            case "4": break;
            case "5": break;
            case "6": break;
            case "7": break;
            case "8": break;
            default:
                System.out.println(choice + " is not a valid entry");
        }
    }
}

import java.util.Scanner;

// Main class to run the DELI-cious application
public class DeliCiousApp {
    private static final Scanner scanner = new Scanner(System.in); // For user input
    private static Order currentOrder; // Holds the current order

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nWelcome to DELI-cious!");
            System.out.println("1) New Order");
            System.out.println("0) Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Handle the leftover newline

            // Navigate based on user's choice
            switch (choice) {
                case 1 -> {
                    currentOrder = new Order();
                    orderScreen();
                }
                case 0 -> {
                    System.out.println("Thank you for visiting DELI-cious!");
                    return; // Exit the application
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // Displays the order menu and handles user actions
    private static void orderScreen() {
        while (true) {
            System.out.println("\nOrder Screen:");
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Handle the leftover newline

            // Perform actions based on user input
            switch (choice) {
                case 1 -> currentOrder.addSandwich();
                case 2 -> currentOrder.addDrink();
                case 3 -> currentOrder.addChips();
                case 4 -> {
                    currentOrder.checkout();
                    return; // Finish the order
                }
                case 0 -> {
                    System.out.println("Order cancelled.");
                    return; // Go back to the main menu
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

import java.util.Scanner;

public class DeliCiousApp {
    private static final Scanner scanner = new Scanner(System.in);
    private static Order currentOrder;

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nWelcome to DELI-cious!");
            System.out.println("1) New Order");
            System.out.println("0) Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    currentOrder = new Order();
                    orderScreen();
                    break;
                case 0:
                    System.out.println("Exiting application. Thank you for visiting DELI-cious!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void orderScreen() {
        while (true) {
            System.out.println("\nOrder Screen:");
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            switch (choice) {
                case 1 -> currentOrder.addSandwich();
                case 2 -> currentOrder.addDrink();
                case 3 -> currentOrder.addChips();
                case 4 -> {
                    currentOrder.checkout();
                    return;
                }
                case 0 -> {
                    System.out.println("Order cancelled.");
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

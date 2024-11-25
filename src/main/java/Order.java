import java.util.ArrayList;
import java.util.List;

// Represents an order with sandwiches, drinks, and chips
public class Order {
    private final List<Sandwich> sandwiches = new ArrayList<>();
    private final List<Drink> drinks = new ArrayList<>();
    private final List<Chips> chipsList = new ArrayList<>();

    // Add a sandwich to the order
    public void addSandwich() {
        Sandwich sandwich = Sandwich.createSandwich();
        sandwiches.add(sandwich);
        System.out.println("Added a sandwich to your order.");
    }

    // Add a drink to the order
    public void addDrink() {
        Drink drink = Drink.createDrink();
        drinks.add(drink);
        System.out.println("Added a drink to your order.");
    }

    // Add chips to the order
    public void addChips() {
        Chips chips = Chips.createChips();
        chipsList.add(chips);
        System.out.println("Added chips to your order.");
    }

    // Display order details, calculate total, and save receipt
    public void checkout() {
        System.out.println("\nOrder Details:");
        double total = 0;

        // List sandwiches
        for (Sandwich sandwich : sandwiches) {
            total += sandwich.getPrice();
            System.out.println(sandwich);
        }

        // List drinks
        for (Drink drink : drinks) {
            total += drink.getPrice();
            System.out.println(drink);
        }

        // List chips
        for (Chips chips : chipsList) {
            total += chips.getPrice();
            System.out.println(chips);
        }

        // Display the total
        System.out.printf("Total: $%.2f\n", total);

        // Save the receipt
        ReceiptManager.saveReceipt(this.toString());
        System.out.println("Order completed and saved to receipt.");
    }

    // Convert the order to a string format for the receipt
    @Override
    public String toString() {
        StringBuilder receipt = new StringBuilder();
        sandwiches.forEach(item -> receipt.append(item).append("\n"));
        drinks.forEach(item -> receipt.append(item).append("\n"));
        chipsList.forEach(item -> receipt.append(item).append("\n"));
        return receipt.toString();
    }
}

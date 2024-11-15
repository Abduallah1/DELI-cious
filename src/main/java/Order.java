import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Sandwich> sandwiches = new ArrayList<>();
    private List<Drink> drinks = new ArrayList<>();
    private List<Chips> chipsList = new ArrayList<>();

    public void addSandwich() {
        Sandwich sandwich = Sandwich.createSandwich();
        sandwiches.add(sandwich);
        System.out.println("Added a sandwich to the order.");
    }

    public void addDrink() {
        Drink drink = Drink.createDrink();
        drinks.add(drink);
        System.out.println("Added a drink to the order.");
    }

    public void addChips() {
        Chips chips = Chips.createChips();
        chipsList.add(chips);
        System.out.println("Added chips to the order.");
    }

    public void checkout() {
        System.out.println("Order Details:");
        double total = 0;

        for (Sandwich sandwich : sandwiches) {
            total += sandwich.getPrice();
            System.out.println(sandwich);
        }

        for (Drink drink : drinks) {
            total += drink.getPrice();
            System.out.println(drink);
        }

        for (Chips chips : chipsList) {
            total += chips.getPrice();
            System.out.println(chips);
        }

        System.out.printf("Total: $%.2f\n", total);

        // Convert Order to String and save
        String receiptContent = this.toString();
        ReceiptManager.saveReceipt(receiptContent);
    }

    @Override
    public String toString() {
        StringBuilder receipt = new StringBuilder("Order Details:\n");
        double total = 0;

        for (Sandwich sandwich : sandwiches) {
            total += sandwich.getPrice();
            receipt.append(sandwich).append("\n");
        }

        for (Drink drink : drinks) {
            total += drink.getPrice();
            receipt.append(drink).append("\n");
        }

        for (Chips chips : chipsList) {
            total += chips.getPrice();
            receipt.append(chips).append("\n");
        }

        receipt.append(String.format("Total: $%.2f\n", total));
        return receipt.toString();
    }
}

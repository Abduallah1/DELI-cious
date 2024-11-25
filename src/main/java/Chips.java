import java.util.Scanner;

// Represents a bag of chips with type and fixed price
public class Chips {
    private String type;
    private final double price = 1.50; // Fixed price for chips

    // Create chips by asking the user for the type
    public static Chips createChips() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose chip type (Original, BBQ, Sour Cream, Jalapeño): ");
        String type = scanner.nextLine();

        Chips chips = new Chips();
        chips.type = type;
        return chips;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Chips{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}

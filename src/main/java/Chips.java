import java.util.Scanner;

public class Chips {
    private String type;
    private double price = 1.50; // fixed price for chips

    public static Chips createChips() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose chip type (e.g., Original, BBQ, Sour Cream): ");
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


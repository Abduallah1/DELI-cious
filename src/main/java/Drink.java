import java.util.Scanner;

// Represents a drink with size, flavor, and price
public class Drink {
    private String size;
    private String flavor;
    private double price;

    // Create a new drink by asking the user for details
    public static Drink createDrink() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose drink size (Small, Medium, Large): ");
        String size = scanner.nextLine().toLowerCase();

        System.out.print("Choose drink flavor (Cola, Lemonade, Orange, Water): ");
        String flavor = scanner.nextLine();

        Drink drink = new Drink();
        drink.size = size;
        drink.flavor = flavor;

        // Set price based on size
        switch (size) {
            case "small" -> drink.price = 2.00;
            case "medium" -> drink.price = 2.50;
            case "large" -> drink.price = 3.00;
            default -> throw new IllegalArgumentException("Invalid size selected.");
        }
        return drink;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "size='" + size + '\'' +
                ", flavor='" + flavor + '\'' +
                ", price=" + price +
                '}';
    }
}

import java.util.Scanner;

public class Drink {
    private String size;
    private double price;

    public static Drink createDrink() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose drink size (Small, Medium, Large): ");
        String size = scanner.nextLine().toLowerCase();

        Drink drink = new Drink();
        drink.size = size;

        // Set price based on size
        switch (size) {
            case "small" -> drink.price = 2.00;
            case "medium" -> drink.price = 2.50;
            case "large" -> drink.price = 3.00;
            default -> throw new IllegalArgumentException("Invalid size selected");
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
                ", price=" + price +
                '}';
    }
}

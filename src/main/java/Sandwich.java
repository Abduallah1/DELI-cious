import java.util.Scanner;

public class Sandwich {
    private String breadType;
    private String size;
    private double price;

    public static Sandwich createSandwich() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose bread (white, wheat, rye, wrap): ");
        String bread = scanner.nextLine();

        System.out.print("Choose size (4\", 8\", 12\"): ");
        String size = scanner.nextLine();

        Sandwich sandwich = new Sandwich();
        sandwich.breadType = bread;
        sandwich.size = size;

        // Simple pricing logic
        switch (size) {
            case "4\"" -> sandwich.price = 5.50;
            case "8\"" -> sandwich.price = 7.00;
            case "12\"" -> sandwich.price = 8.50;
            default -> throw new IllegalArgumentException("Invalid size selected");
        }
        return sandwich;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "breadType='" + breadType + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}

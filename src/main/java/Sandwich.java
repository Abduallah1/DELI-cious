import java.util.Scanner;

// Represents a sandwich with bread type, size, meat type, price, and customization options
public class Sandwich {
    private String breadType;
    private String size;
    private String meatType;
    private double price;
    private boolean toasted;
    private boolean cutInHalf;

    // Create a new sandwich by asking the user for details
    public static Sandwich createSandwich() {
        Scanner scanner = new Scanner(System.in);

        // Choose bread type
        System.out.print("Choose bread (white, whole wheat, Italian, wrap): ");
        String bread = scanner.nextLine();

        // Choose size
        System.out.print("Choose size (4\", 8\", 12\"): ");
        String size = scanner.nextLine();

        // Choose meat type
        System.out.print("Choose meat type (chicken, steak, vegetarian): ");
        String meatType = scanner.nextLine();

        // Toasted or not
        System.out.print("Do you want it toasted? (yes/no): ");
        boolean toasted = scanner.nextLine().equalsIgnoreCase("yes");

        // Cut in half or not
        System.out.print("Do you want it cut in half? (yes/no): ");
        boolean cutInHalf = scanner.nextLine().equalsIgnoreCase("yes");

        // Create and set up the sandwich
        Sandwich sandwich = new Sandwich();
        sandwich.breadType = bread;
        sandwich.size = size;
        sandwich.meatType = meatType;
        sandwich.toasted = toasted;
        sandwich.cutInHalf = cutInHalf;

        // Pricing logic based on size and type of meat
        switch (size) {
            case "4\"" -> sandwich.price = 5.50;
            case "8\"" -> sandwich.price = 7.00;
            case "12\"" -> sandwich.price = 8.50;
            default -> throw new IllegalArgumentException("Invalid size selected.");
        }

        // Additional charge for steak
        if (meatType.equalsIgnoreCase("steak")) {
            sandwich.price += 2.00; // Add $2 for steak
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
                ", meatType='" + meatType + '\'' +
                ", toasted=" + (toasted ? "Yes" : "No") +
                ", cutInHalf=" + (cutInHalf ? "Yes" : "No") +
                ", price=$" + price +
                '}';
    }
}


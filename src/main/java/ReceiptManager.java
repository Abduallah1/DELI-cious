import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Manages saving order receipts to a file
public class ReceiptManager {
    public static void saveReceipt(String receiptContent) {
        try {
            // Ensure the receipts directory exists
            File directory = new File("receipts");
            if (!directory.exists()) {
                directory.mkdirs(); // Create the directory if it doesn't exist
            }

            // Save the receipt
            String filename = "receipts/" + java.time.LocalDateTime.now()
                    .toString()
                    .replace(":", "")
                    .replace(".", "") + ".txt";
            FileWriter writer = new FileWriter(filename);
            writer.write(receiptContent);
            writer.close();

            System.out.println("Receipt saved successfully.");
        } catch (IOException e) {
            System.out.println("Failed to save receipt.");
            e.printStackTrace();
        }
    }
}


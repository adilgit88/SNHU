import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram2 {
    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);

        // Read the filename from the user
        String filename = scnr.nextLine();

        // Open the input file
        Scanner fileScanner = new Scanner(new FileInputStream(filename));

        // Arrays to store category, name, description, and availability status
        String[] categories = new String[100];
        String[] names = new String[100];
        String[] descriptions = new String[100];
        String[] availability = new String[100];

        int itemCount = 0;

        // Read the file line by line
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            String[] tokens = line.split("\t");

            // Store the data into arrays
            categories[itemCount] = tokens[0];
            names[itemCount] = tokens[1];
            descriptions[itemCount] = tokens[2];
            availability[itemCount] = tokens[3];

            // Increase the item count
            itemCount++;
        }

        fileScanner.close();

        // Output the available food items
        for (int i = 0; i < itemCount; i++) {
            // Check if the item is available
            if (availability[i].equals("Available")) {
                // Print in the required format: name (category) -- description
                System.out.printf("%s (%s) -- %s\n", names[i], categories[i], descriptions[i]);
            }
        }
    }
}

import java.util.Scanner;

public class ParseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Prompt the user for a string that contains two strings separated by a comma
            System.out.println("Enter input string: ");
            String input = scanner.nextLine();

            // Exit the loop if the user enters 'q'
            if (input.equals("q")) {
                break;
            }

            // Check if the input contains a comma
            if (!input.contains(",")) {
                System.out.println("Error: No comma in string");
                continue; // Re-prompt the user
            }

            // Split the input string into two parts using the comma separator
            String[] parts = input.split(",");

            // Remove any leading or trailing spaces from both parts
            String firstWord = parts[0].trim();
            String secondWord = parts[1].trim();

            // Output the two words
            System.out.println("First word: " + firstWord);
            System.out.println("Second word: " + secondWord);
            System.out.println();
            System.out.println();// Add an extra newline for spacing between outputs
        }

        scanner.close();
    }
}

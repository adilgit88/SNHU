import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram3 {
    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);
        int NUM_CHARACTERS = 26;      // Number of letters in the alphabet
        int MAX_WORDS = 10;           // Maximum number of synonyms per starting letter

        String[][] synonyms = new String[NUM_CHARACTERS][MAX_WORDS];  // Declare 2D array for all synonyms
        String[] words = new String[MAX_WORDS]; // Array to hold words from each line

        // Read the word and letter from the user
        String word = scnr.next();   // The word whose synonyms we are looking for
        char letter = scnr.next().charAt(0);  // The letter for which we need synonyms

        // Open the file corresponding to the word
        Scanner fileScanner = new Scanner(new FileInputStream(word + ".txt"));

        // Read the synonyms from the file and store them in the array
        int[] counts = new int[NUM_CHARACTERS];  // Keep track of number of words for each letter
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            String[] tokens = line.split(" ");  // Split the line by spaces

            // Store each synonym into the corresponding row in the array
            for (String token : tokens) {
                char firstChar = token.charAt(0);  // Get the first character of the synonym
                int index = firstChar - 'a';  // Map character to index ('a' = 0, 'b' = 1, ..., 'z' = 25)

                if (counts[index] < MAX_WORDS) {
                    synonyms[index][counts[index]] = token;
                    counts[index]++;
                }
            }
        }
        fileScanner.close();

        // Convert the input letter to lowercase and find its corresponding index
        letter = Character.toLowerCase(letter);
        int letterIndex = letter - 'a';  // Map the letter to an index

        // Check if there are any synonyms starting with the given letter
        boolean foundSynonym = false;
        for (int i = 0; i < counts[letterIndex]; i++) {
            // Print each synonym that starts with the given letter
            System.out.println(synonyms[letterIndex][i]);
            foundSynonym = true;
        }

        // If no synonyms are found, output a message
        if (!foundSynonym) {
            System.out.println("No synonyms for " + word + " begin with " + letter + ".");
        }
    }
}

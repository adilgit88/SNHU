package Lab;

import java.util.Scanner;

public class PeopleWeights {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare an array to store the weights of 5 people
        double[] weights = new double[5];

        // Get input for each person's weight
        for (int i = 0; i < weights.length; i++) {
            System.out.print("Enter weight " + (i + 1) + ": ");
            weights[i] = scanner.nextDouble();
        }

        // Output the entered weights
        System.out.print("You entered: ");
        for (int i = 0; i < weights.length; i++) {
            System.out.print(weights[i] + " ");
        }
        System.out.println();

        // Calculate the total weight
        double totalWeight = 0;
        for (int i = 0; i < weights.length; i++) {
            totalWeight += weights[i];
        }

        // Calculate the average weight
        double averageWeight = totalWeight / weights.length;

        // Find the maximum weight
        double maxWeight = weights[0];
        for (int i = 1; i < weights.length; i++) {
            if (weights[i] > maxWeight) {
                maxWeight = weights[i];
            }
        }

        // Output total, average, and max weight
        System.out.println("Total weight: " + totalWeight);
        System.out.println("Average weight: " + averageWeight);
        System.out.println("Max weight: " + maxWeight);
    }
}

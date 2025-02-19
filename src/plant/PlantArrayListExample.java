package plant;

import java.util.Scanner;
import java.util.ArrayList;

public class PlantArrayListExample {

    // Define the printArrayList method that prints an ArrayList of plant (or flower) objects
    public static void printArrayList(ArrayList<Plant> myGarden) {
        for (Plant plant : myGarden) {
            plant.printInfo();
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String input;
        ArrayList<Plant> myGarden = new ArrayList<>();  // ArrayList to hold Plant and Flower objects

        String plantName, plantCost, colorOfFlowers;
        boolean isAnnual;

        input = scnr.next();
        while (!input.equals("-1")) {
            // Check if input is a plant or flower
            if (input.equals("plant")) {
                // Reading plant data
                plantName = scnr.next();
                plantCost = scnr.next();
                Plant newPlant = new Plant();
                newPlant.setPlantName(plantName);
                newPlant.setPlantCost(plantCost);
                myGarden.add(newPlant);  // Add the Plant object to myGarden
            } else if (input.equals("flower")) {
                // Reading flower data
                plantName = scnr.next();
                plantCost = scnr.next();
                isAnnual = scnr.nextBoolean();
                colorOfFlowers = scnr.next();
                Flower newFlower = new Flower();
                newFlower.setPlantName(plantName);
                newFlower.setPlantCost(plantCost);
                newFlower.setPlantType(isAnnual);
                newFlower.setColorOfFlowers(colorOfFlowers);
                myGarden.add(newFlower);  // Add the Flower object to myGarden
            }
            input = scnr.next();  // Read next input
        }

        // Call the method to print the ArrayList
        printArrayList(myGarden);
    }
}

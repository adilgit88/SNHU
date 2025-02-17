package unitTest;

import java.util.Scanner;

import java.util.Scanner;

public class CallInventoryTag {
    public static void main(String [] args) {
        Scanner scnr = new Scanner(System.in);
        InventoryTag redSweater = new InventoryTag();
        int sweaterShipment;
        int sweaterInventoryBefore;

        sweaterInventoryBefore = redSweater.getQuantityRemaining();
        sweaterShipment = scnr.nextInt();

        System.out.println("Beginning tests.");

        // Perform the addInventory() operation
        redSweater.addInventory(sweaterShipment);

        // Check if the inventory is correctly updated
        int expectedQuantity = (sweaterShipment > 10) ? sweaterInventoryBefore + sweaterShipment : sweaterInventoryBefore;

        if (redSweater.getQuantityRemaining() != expectedQuantity) {
            System.out.println("   UNIT TEST FAILED: addInventory()");
        }

        System.out.println("Tests complete.");
    }
}

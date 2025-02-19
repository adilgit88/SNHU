package shopping;

import java.util.Scanner;

public class ShoppingCartPrinter {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Create two ItemToPurchase objects
        ItemToPurchase item1 = new ItemToPurchase();
        ItemToPurchase item2 = new ItemToPurchase();

        // Get details for item 1
        System.out.println("Item 1");
        System.out.print("Enter the item name: ");
        item1.setName(scnr.nextLine()); // Get item name
        System.out.print("Enter the item price: ");
        item1.setPrice(scnr.nextInt()); // Get item price
        System.out.print("Enter the item quantity: ");
        item1.setQuantity(scnr.nextInt()); // Get item quantity
        scnr.nextLine(); // Clear the newline character from buffer

        // Get details for item 2
        System.out.println("Item 2");
        System.out.print("Enter the item name: ");
        item2.setName(scnr.nextLine()); // Get item name
        System.out.print("Enter the item price: ");
        item2.setPrice(scnr.nextInt()); // Get item price
        System.out.print("Enter the item quantity: ");
        item2.setQuantity(scnr.nextInt()); // Get item quantity

        // Calculate total cost
        int totalCost = (item1.getPrice() * item1.getQuantity()) + (item2.getPrice() * item2.getQuantity());

        // Print the details
        System.out.println("\nTOTAL COST");
        item1.printItemPurchase();
        item2.printItemPurchase();
        System.out.println("\nTotal: $" + totalCost);
    }
}

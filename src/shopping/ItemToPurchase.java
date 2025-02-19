package shopping;

public class ItemToPurchase {
    // Private fields
    private String itemName;
    private int itemPrice;
    private int itemQuantity;

    // Default constructor initializing fields
    public ItemToPurchase() {
        itemName = "none";
        itemPrice = 0;
        itemQuantity = 0;
    }

    // Setters and getters for itemName
    public void setName(String name) {
        itemName = name;
    }

    public String getName() {
        return itemName;
    }

    // Setters and getters for itemPrice
    public void setPrice(int price) {
        itemPrice = price;
    }

    public int getPrice() {
        return itemPrice;
    }

    // Setters and getters for itemQuantity
    public void setQuantity(int quantity) {
        itemQuantity = quantity;
    }

    public int getQuantity() {
        return itemQuantity;
    }

    // Method to print item details in the format: quantity itemName price * quantity = total cost
    public void printItemPurchase() {
        System.out.println(itemName + " " + itemQuantity + " @ $" + itemPrice + " = $" + (itemPrice * itemQuantity));
    }
}

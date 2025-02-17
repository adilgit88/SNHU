package Inventory;


public class InventoryNode {
    private String item;
    private int numberOfItems;
    private InventoryNode nextNodeRef; // Reference to the next node

    public InventoryNode() {
        item = "";
        numberOfItems = 0;
        nextNodeRef = null;
    }

    // Constructor
    public InventoryNode(String itemInit, int numberOfItemsInit) {
        this.item = itemInit;
        this.numberOfItems = numberOfItemsInit;
        this.nextNodeRef = null;
    }

    // Constructor
    public InventoryNode(String itemInit, int numberOfItemsInit, InventoryNode nextLoc) {
        this.item = itemInit;
        this.numberOfItems = numberOfItemsInit;
        this.nextNodeRef = nextLoc;
    }

    // Insert node at the front of the linked list (after the dummy head node)
    public void insertAtFront(InventoryNode headNode, InventoryNode newNode) {
        newNode.nextNodeRef = headNode.nextNodeRef; // Link new node to the existing first node
        headNode.nextNodeRef = newNode; // Update head node to point to the new node
    }

    // Get location pointed by nextNodeRef
    public InventoryNode getNext() {
        return this.nextNodeRef;
    }

    // Print node data
    public void printNodeData() {
        System.out.println(this.numberOfItems + " " + this.item);
    }
}

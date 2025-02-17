package ShoppingList;


public class ItemNode {
    private String item;
    private ItemNode nextNodeRef; // Reference to the next node

    public ItemNode() {
        item = "";
        nextNodeRef = null;
    }

    // Constructor
    public ItemNode(String itemInit) {
        this.item = itemInit;
        this.nextNodeRef = null;
    }

    // Constructor
    public ItemNode(String itemInit, ItemNode nextLoc) {
        this.item = itemInit;
        this.nextNodeRef = nextLoc;
    }

    // Insert node after this node.
    public void insertAfter(ItemNode nodeLoc) {
        ItemNode tmpNext;

        tmpNext = this.nextNodeRef;
        this.nextNodeRef = nodeLoc;
        nodeLoc.nextNodeRef = tmpNext;
    }

    // Insert node at the end of the list
    public void insertAtEnd(ItemNode headNode, ItemNode newNode) {
        ItemNode currNode = headNode;

        // Traverse the list until the last node is reached
        while (currNode.getNext() != null) {
            currNode = currNode.getNext();
        }

        // Insert the new node at the end of the list
        currNode.insertAfter(newNode);
    }

    // Get location pointed by nextNodeRef
    public ItemNode getNext() {
        return this.nextNodeRef;
    }

    public void printNodeData() {
        System.out.println(this.item);

    }
}

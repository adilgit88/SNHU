package mileage;
import java.util.Scanner;

public class MileageTrackerLinkedList {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // References for MileageTrackerNode objects
        MileageTrackerNode headNode;
        MileageTrackerNode currNode;
        MileageTrackerNode lastNode;

        double miles;
        String date;
        int numNodes;

        // Create dummy head node
        headNode = new MileageTrackerNode();
        lastNode = headNode;

        // Scan the number of nodes
//        System.out.print("Enter the number of mileage entries: ");
        numNodes = scnr.nextInt();
        scnr.nextLine();  // consume the newline character

        // For the scanned number of nodes, scan in data and insert into the linked list
        for (int i = 0; i < numNodes; i++) {
            // Get mileage and date from user
            miles = scnr.nextDouble();
            scnr.nextLine();  // consume the newline character
            date = scnr.nextLine();

            // Create new node
            MileageTrackerNode newNode = new MileageTrackerNode(miles, date);

            // Insert node into the linked list after the last node
            lastNode.insertAfter(newNode);

            // Update lastNode to be the newly inserted node
            lastNode = newNode;
        }

        // Print the linked list (skip dummy head node)
        currNode = headNode.getNext();  // Start from the first real node (skip dummy head)
        while (currNode != null) {
            currNode.printNodeData();
            currNode = currNode.getNext();
        }
    }
}

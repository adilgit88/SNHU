package Lab.Book;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class Library {

    public static void fillLibraries(LinkedListLibrary linkedListLibrary, ArrayListLibrary arrayListLibrary) throws IOException {
        FileInputStream fileByteStream = null; // File input stream
        Scanner inFS = null;                   // Scanner object
        int linkedListOperations = 0;
        int arrayListOperations = 0;

        BookNode currNode;
        Book tempBook;

        String bookTitle;
        String bookAuthor;
        long bookISBN;

        // Try to open file
        fileByteStream = new FileInputStream("Books.txt");
        inFS = new Scanner(fileByteStream);

        while (inFS.hasNextLine()) {
            bookTitle = inFS.nextLine();
            bookISBN = inFS.nextLong();
            inFS.nextLine();
            bookAuthor = inFS.nextLine();

            // Insert into linked list
            currNode = new BookNode(bookTitle, bookAuthor, bookISBN);
            linkedListOperations = linkedListLibrary.insertSorted(currNode, linkedListOperations);
            linkedListLibrary.lastNode = currNode;

            // Insert into ArrayList
            tempBook = new Book(bookTitle, bookAuthor, bookISBN);
            arrayListOperations = arrayListLibrary.insertSorted(tempBook, arrayListOperations);
        }

        fileByteStream.close(); // close() may throw IOException if fails
    }

    public static void main (String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);
        int linkedListOperations = 0;
        int arrayListOperations = 0;

        // Create libraries
        LinkedListLibrary linkedListLibrary = new LinkedListLibrary();
        ArrayListLibrary arrayListLibrary = new ArrayListLibrary();

        // Fill libraries with 100 books
        fillLibraries(linkedListLibrary, arrayListLibrary);

        // Create new book to insert into libraries
        String bookTitle;
        String bookAuthor;
        long bookISBN;

        // Read book information from user
        bookTitle = scnr.nextLine();
        bookISBN = scnr.nextLong();
        scnr.nextLine();  // Consume newline
        bookAuthor = scnr.nextLine();

        // Insert into linked list
        BookNode currNode = new BookNode(bookTitle, bookAuthor, bookISBN);
        linkedListOperations = linkedListLibrary.insertSorted(currNode, linkedListOperations);
        linkedListLibrary.lastNode = currNode; // Update last node if necessary

        // Insert into ArrayList
        Book tempBook = new Book(bookTitle, bookAuthor, bookISBN);
        arrayListOperations = arrayListLibrary.insertSorted(tempBook, arrayListOperations);

        // Print number of operations for linked list
        System.out.println("Number of linked list operations: " + linkedListOperations);

        // Print number of operations for ArrayList
        System.out.println("Number of ArrayList operations: " + arrayListOperations);
    }

}

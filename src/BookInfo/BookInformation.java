package BookInfo;
import java.util.Scanner;

public class BookInformation {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Book myBook = new Book();
        Encyclopedia myEncyclopedia = new Encyclopedia();

        String title, author, publisher, publicationDate;
        String eTitle, eAuthor, ePublisher, ePublicationDate, edition;
        int numVolumes;

        // Read input for the first book
        title = scnr.nextLine();
        author = scnr.nextLine();
        publisher = scnr.nextLine();
        publicationDate = scnr.nextLine();

        // Read input for the encyclopedia
        eTitle = scnr.nextLine();
        eAuthor = scnr.nextLine();
        ePublisher = scnr.nextLine();
        ePublicationDate = scnr.nextLine();
        edition = scnr.nextLine();
        numVolumes = scnr.nextInt();

        // Set details for the first book and print
        myBook.setTitle(title);
        myBook.setAuthor(author);
        myBook.setPublisher(publisher);
        myBook.setPublicationDate(publicationDate);
        myBook.printInfo();

        // Set details for the encyclopedia and print
        myEncyclopedia.setTitle(eTitle);
        myEncyclopedia.setAuthor(eAuthor);
        myEncyclopedia.setPublisher(ePublisher);
        myEncyclopedia.setPublicationDate(ePublicationDate);
        myEncyclopedia.setEdition(edition);
        myEncyclopedia.setNumVolumes(numVolumes);
        myEncyclopedia.printInfo();
    }
}

package Playlist;

import java.util.Scanner;

public class Playlist {

    // Method to print the entire playlist
    public static void printPlaylist(SongNode headNode) {
        SongNode currentNode = headNode.getNext(); // Start with the first song (skip the dummy head node)

        while (currentNode != null) {
            currentNode.printSongInfo();  // Print the song details
            currentNode = currentNode.getNext();  // Move to the next node
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        SongNode headNode;
        SongNode currNode;
        SongNode lastNode;

        String songTitle;
        int songLength;
        String songArtist;

        // Front of nodes list
        headNode = new SongNode();
        lastNode = headNode;

        // Read user input until -1 entered
        songTitle = scnr.nextLine();
        while (!songTitle.equals("-1")) {
            songLength = scnr.nextInt();
            scnr.nextLine();  // Consume the newline character
            songArtist = scnr.nextLine();

            currNode = new SongNode(songTitle, songLength, songArtist);
            lastNode.insertAfter(currNode);
            lastNode = currNode;

            songTitle = scnr.nextLine();
        }

        // Print linked list
        System.out.println("LIST OF SONGS");
        System.out.println("-------------");
        printPlaylist(headNode);
    }
}

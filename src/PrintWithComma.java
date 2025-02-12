import java.util.Scanner;

public class PrintWithComma {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_VALS = 4;
        int[] hourlyTemp = new int[NUM_VALS];
        int i;

        for (i = 0; i < hourlyTemp.length; ++i) {
            hourlyTemp[i] = scnr.nextInt();
        }

        /* Your solution goes here  */
        for (i = 0; i < hourlyTemp.length; ++i) {
            if (i > 0) {
                System.out.print(", ");  // Print comma and space before every element except the first
            }
            System.out.print(hourlyTemp[i]);  // Print the current element
        }


        System.out.println("");
    }
}

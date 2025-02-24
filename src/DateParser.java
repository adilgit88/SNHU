import java.util.Scanner;

public class DateParser {
    public static int getMonthAsInt(String monthString) {
        int monthInt;

        // Java switch/case statement
        switch (monthString) {
            case "January":
                monthInt = 1;
                break;
            case "February":
                monthInt = 2;
                break;
            case "March":
                monthInt = 3;
                break;
            case "April":
                monthInt = 4;
                break;
            case "May":
                monthInt = 5;
                break;
            case "June":
                monthInt = 6;
                break;
            case "July":
                monthInt = 7;
                break;
            case "August":
                monthInt = 8;
                break;
            case "September":
                monthInt = 9;
                break;
            case "October":
                monthInt = 10;
                break;
            case "November":
                monthInt = 11;
                break;
            case "December":
                monthInt = 12;
                break;
            default:
                monthInt = 0;
        }

        return monthInt;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        while (true) {
            String input = scnr.nextLine();

            // Check if the input is "-1", signaling the end of input
            if (input.equals("-1")) {
                break;
            }

            // Try to parse the date format: "Month day, year"
            int firstSpaceIndex = input.indexOf(" ");
            int commaIndex = input.indexOf(",");

            if (firstSpaceIndex != -1 && commaIndex != -1) {
                // Extract the month, day, and year
                String monthString = input.substring(0, firstSpaceIndex);
                String dayString = input.substring(firstSpaceIndex + 1, commaIndex).trim();
                String yearString = input.substring(commaIndex + 1).trim();

                // Validate and parse the components
                int month = getMonthAsInt(monthString);
                int day = 0;
                int year = 0;

                try {
                    day = Integer.parseInt(dayString);
                    year = Integer.parseInt(yearString);
                } catch (NumberFormatException e) {
                    // If day or year cannot be parsed, skip this date
                    continue;
                }

                // If the month is valid and the year is four digits, print the date in m/d/yyyy format
                if (month > 0 && year > 0 && year <= 9999) {
                    System.out.println(month + "/" + day + "/" + year);
                }
            }
        }
    }
}

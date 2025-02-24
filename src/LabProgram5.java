import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class LabProgram5 {
    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);
        String csvFilename;
        FileInputStream fileByteStream = null;
        Scanner fileScanner = null;
        Map<String, Map<String, ArrayList<String>>> movieData = new HashMap<>();


        csvFilename = scnr.next();

        fileByteStream = new FileInputStream(csvFilename);
        fileScanner = new Scanner(fileByteStream);

        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            String[] parts = line.split(",");
            String showtime = parts[0];
            String title = parts[1];
            String rating = parts[2];

            if (movieData.containsKey(title)) {
                movieData.get(title).get("showtimes").add(showtime);
            } else {
                Map<String, ArrayList<String>> movieInfo = new HashMap<>();
                movieInfo.put("rating", new ArrayList<>());
                movieInfo.put("showtimes", new ArrayList<>());
                movieInfo.get("rating").add(rating);
                movieInfo.get("showtimes").add(showtime);
                movieData.put(title, movieInfo);
            }
        }

        fileByteStream.close();


        for (Map.Entry<String, Map<String, ArrayList<String>>> entry : movieData.entrySet()) {
            String title = entry.getKey();
            Map<String, ArrayList<String>> movieInfo = entry.getValue();
            String rating = movieInfo.get("rating").get(0);
            ArrayList<String> showtimesList = movieInfo.get("showtimes");

            String formattedTitle = title;
            if (formattedTitle.length() > 44) {
                formattedTitle = formattedTitle.substring(0, 44);
            }
            formattedTitle = String.format("%-44s", formattedTitle);

            String formattedRating = String.format("%5s", rating);

            String formattedShowtimes = "";
            for (String showtime : showtimesList) {
                formattedShowtimes += showtime + " ";
            }
            formattedShowtimes = formattedShowtimes.trim();


            System.out.printf("%s | %s | %s%n", formattedTitle, formattedRating, formattedShowtimes);
        }
    }
}
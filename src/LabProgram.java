import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;

public class LabProgram {
    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);

        // Read the filename from the user
        String inputFileName = scnr.nextLine();

        // Open the input file
        Scanner fileScanner = new Scanner(new FileInputStream(inputFileName));

        // Arrays to store the scores for each exam and student data
        String[] lastNames = new String[20];
        String[] firstNames = new String[20];
        int[] midterm1Scores = new int[20];
        int[] midterm2Scores = new int[20];
        int[] finalScores = new int[20];
        double[] averages = new double[20];
        int studentCount = 0;

        // Read the student information from the file
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            String[] tokens = line.split("\t");

            // Extract student info and scores
            lastNames[studentCount] = tokens[0];
            firstNames[studentCount] = tokens[1];
            midterm1Scores[studentCount] = Integer.parseInt(tokens[2]);
            midterm2Scores[studentCount] = Integer.parseInt(tokens[3]);
            finalScores[studentCount] = Integer.parseInt(tokens[4]);

            // Compute the average score for the student
            averages[studentCount] = (midterm1Scores[studentCount] + midterm2Scores[studentCount] + finalScores[studentCount]) / 3.0;

            studentCount++;
        }
        fileScanner.close();

        // Arrays to compute exam averages
        double midterm1Avg = 0, midterm2Avg = 0, finalAvg = 0;

        // Calculate the total scores for each exam to compute the average later
        for (int i = 0; i < studentCount; i++) {
            midterm1Avg += midterm1Scores[i];
            midterm2Avg += midterm2Scores[i];
            finalAvg += finalScores[i];
        }

        // Compute the average scores for each exam
        midterm1Avg /= studentCount;
        midterm2Avg /= studentCount;
        finalAvg /= studentCount;

        // Open the output file (report.txt)
        PrintWriter output = new PrintWriter(new FileOutputStream("report.txt"));

        // Process each student's data and assign a letter grade
        for (int i = 0; i < studentCount; i++) {
            String grade = "";
            double avgScore = averages[i];

            // Assign letter grade based on average score
            if (avgScore >= 90) {
                grade = "A";
            } else if (avgScore >= 80) {
                grade = "B";
            } else if (avgScore >= 70) {
                grade = "C";
            } else if (avgScore >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }

            // Output student data to the file
            output.printf("%s\t%s\t%d\t%d\t%d\t%s\n", lastNames[i], firstNames[i], midterm1Scores[i], midterm2Scores[i], finalScores[i], grade);
        }

        // Output the averages of each exam
        output.printf("\nAverages: Midterm1 %.2f, Midterm2 %.2f, Final %.2f\n", midterm1Avg, midterm2Avg, finalAvg);

        // Close the output file
        output.close();
    }
}

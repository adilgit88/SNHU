package courseInfo;

import java.util.Scanner;



public class CourseInformation {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Course myCourse = new Course();
        OfferedCourse myOfferedCourse = new OfferedCourse();

        String courseNumber, courseTitle;
        String oCourseNumber, oCourseTitle, instructorName, term, classTime;

        // Read the input
        courseNumber = scnr.nextLine();
        courseTitle = scnr.nextLine();

        oCourseNumber =  scnr.nextLine();
        oCourseTitle =  scnr.nextLine();
        instructorName = scnr.nextLine();
        term = scnr.nextLine();
        classTime = scnr.nextLine();

        // Set course information
        myCourse.setCourseNumber(courseNumber);
        myCourse.setCourseTitle(courseTitle);
        myCourse.printInfo();

        // Set offered course information
        myOfferedCourse.setCourseNumber(oCourseNumber);
        myOfferedCourse.setCourseTitle(oCourseTitle);
        myOfferedCourse.setInstructorName(instructorName);
        myOfferedCourse.setTerm(term);
        myOfferedCourse.setClassTime(classTime);
        myOfferedCourse.printInfo();
    }
}

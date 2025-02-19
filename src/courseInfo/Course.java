package courseInfo;

public class Course {
    // Private fields for courseNumber and courseTitle
    private String courseNumber;
    private String courseTitle;

    // Mutator methods (setters)
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    // Accessor methods (getters)
    public String getCourseNumber() {
        return courseNumber;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    // Method to print course information
    public void printInfo() {
//        System.out.println("Course Information: ");
//        System.out.println("   Course Number: " + getCourseNumber());
//        System.out.println("   Course Title: " + getCourseTitle());
    }
}

package courseInfo;

public class OfferedCourse extends Course {
    // Private fields for instructorName, term, and classTime
    private String instructorName;
    private String term;
    private String classTime;

    // Mutator methods (setters)
    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }

    // Accessor methods (getters)
    public String getInstructorName() {
        return instructorName;
    }

    public String getTerm() {
        return term;
    }

    public String getClassTime() {
        return classTime;
    }

    // Method to print course information including instructor name, term, and class time
    @Override
    public void printInfo() {
        super.printInfo(); // Call the base class printInfo method
        System.out.println("   Instructor Name: " + getInstructorName());
        System.out.println("   Term: " + getTerm());
        System.out.println("   Class Time: " + getClassTime());
    }
}

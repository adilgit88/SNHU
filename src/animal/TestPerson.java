package animal;

public class TestPerson {
    public static void main(String[] args) {
        Student myStudent = new Student("Gus", 14, 3.9);
        Teacher myTeacher = new Teacher("Matisse", 36, "Art");

        myStudent.printInfo();
        System.out.println();
        myTeacher.printInfo();
    }
}
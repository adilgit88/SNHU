package Employees;

public class EmployeeMain {

    public static void main(String [] args) {

        // Create the objects
        EmployeeManager manager = new EmployeeManager(25);
        EmployeeStaff   staff1  = new EmployeeStaff("Michele");

        // Load data into the objects using the Person class's method
        manager.setData("Michele", "Sales", "03-03-1975", 70000);
        staff1.setData ("Bob",     "Sales", "02-02-1980", 50000);

        // Print the objects
        manager.printInfo();
        System.out.println("Annual bonus: " + manager.getAnnualBonus());
        staff1.printInfo();
        System.out.println("Annual bonus: " + staff1.getAnnualBonus());
    }
}


abstract class EmployeePerson {
    protected String fullName;       // In the format last name, first name
    protected String departmentCode;
    protected String birthday;
    protected int annualSalary;

    // Default constructor. Set protected variables to the empty string or 0
    public EmployeePerson() {
        fullName = "";
        departmentCode = "";
        birthday = "";
        annualSalary = 0;
    }

    // Constructor with parameters to set the private variables
    public EmployeePerson(String empFullName, String empDepartmentCode,
                          String empBirthday, int empAnnualSalary) {
        setData(empFullName, empDepartmentCode, empBirthday, empAnnualSalary);
    }

    public void setData(String empFullName, String empDepartmentCode,
                        String empBirthday, int empAnnualSalary) {
        fullName       = empFullName;
        departmentCode = empDepartmentCode;
        birthday       = empBirthday;
        annualSalary   = empAnnualSalary;
    }

    // Ensure each subclass has a printInfo() method
    abstract void printInfo();

    // Ensure each subclass has a getAnnualBonus() method
    abstract int getAnnualBonus();
}



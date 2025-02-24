package Employees;

public class EmployeeManager extends EmployeePerson {
    private int numManaged;    // Number of staff managed

    // Default constructor
    public EmployeeManager() {
        numManaged = 0;
    }

    // Constructor with parameters
    public EmployeeManager(int nManaged) {
        numManaged = nManaged;
    }

    // Get the number of people managed
    public int getNumManaged() {
        return numManaged;
    }

    @Override
    public void printInfo() {
        System.out.println("Name: " + fullName + ", Department: " +
                departmentCode + ", Birthday: " + birthday +
                ", Salary: " + annualSalary +
                ", Staff managed: " + getNumManaged());
    }

    // Implement the getAnnualBonus method. A manager's annual bonus
    // is calculated as 10% of the manager's annual salary.
    @Override
    public int getAnnualBonus() {
        return (int)(annualSalary * 0.10); // 10% of annual salary
    }
}

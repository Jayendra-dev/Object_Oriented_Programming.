package employee;

public class Employee
{
    protected int id;
    protected String name;
    protected double basicSalary;

    // Constructor
    public Employee(int id, String name, double basicSalary)
    {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Display employee details
    public void display()
    {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }

    // Salary calculation method
    public void calculateSalary()
    {
        System.out.println("Basic Salary: " + basicSalary);
    }
}
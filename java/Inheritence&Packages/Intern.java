package employee;

public class Intern extends Employee
{
    public Intern(int id, String name, double salary)
    {
        super(id, name, salary);
    }

    @Override
    public void calculateSalary()
    {
        double hra = basicSalary * 0.05;
        double da = basicSalary * 0.05;

        double total = basicSalary + hra + da;

        display();

        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + total);
    }
}
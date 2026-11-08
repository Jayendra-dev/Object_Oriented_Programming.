package employee;

public class Manager extends Employee
{
    public Manager(int id, String name, double salary)
    {
        super(id, name, salary);
    }

    @Override
    public void calculateSalary()
    {
        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.15;
        double special = basicSalary * 0.10;

        double total = basicSalary + hra + da + special;

        display();

        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Special Allowance: " + special);
        System.out.println("Gross Salary: " + total);
    }
}
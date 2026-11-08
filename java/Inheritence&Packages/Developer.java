package employee;

public class Developer extends Employee
{
    public Developer(int id, String name, double salary)
    {
        super(id, name, salary);
    }

    @Override
    public void calculateSalary()
    {
        double hra = basicSalary * 0.15;
        double da = basicSalary * 0.10;
        double technical = basicSalary * 0.10;

        double total = basicSalary + hra + da + technical;

        display();

        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Technical Allowance: " + technical);
        System.out.println("Gross Salary: " + total);
    }
}
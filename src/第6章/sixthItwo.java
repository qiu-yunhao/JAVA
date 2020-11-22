package 第6章;

public class sixthItwo
{
    public static void main(String[] args)
    {}
}
class Employee implements Comparable<Employee>
{
    private String name;
    private double salary;
    public Employee(String name,double salary)
    {
        this.name=name;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    public void raiseSalary(double bypercent)
    {
        double raise=salary*bypercent/100;
        salary+=raise;
    }
    public int compareTo(Employee o)
    {
        return Double.compare(salary,o.salary);
    }
}

package 第4章;

public class FourthIfour
{
    public static void main(String[] args) {
        System.out.println("Testing tripValue:");
        double percent = 10;
        System.out.println("Before: percent=" + percent);
        tripValue(percent);
        System.out.println("After: percent=" + percent);

        System.out.println("\nTesting tripSalary:");
        var harry = new Employee1("harry", 50000);
        System.out.println("Before:salary = {"+harry.getSalary()+"}");
        tripSalary(harry);
        System.out.println("After:salary = {"+harry.getSalary()+"}");

        System.out.println("\nTesting swap");
        var a= new Employee1("Alice",70000);
        var b= new Employee1("Bob",60000);
        System.out.println("Before:a="+a.getName());
        System.out.println("Before:b="+b.getName());
        swap(a,b);
        System.out.println("Before:a="+a.getName());
        System.out.println("Before:b="+b.getName());
    }
    public static void tripValue(double x)
    {
        x=x*3;
        System.out.println("End of method : x="+x);;
    }
    public static void tripSalary(Employee1 x)
    {
        x.raiseSalary(200);
        System.out.println("end of : Salary="+x.getSalary());
    }
    public static void swap(Employee1 x,Employee1 y)
    {
        Employee1 tmp=x;
        x=y;
        y=tmp;
        System.out.println("End of method : x="+x.getName());
        System.out.println("End of method : y="+y.getName());
    }
}
class Employee1
{
    private String name;
    private double salary;

    public Employee1(String n,double s)
    {
        name=n;
        salary=s;

    }
    public String getName()
    {
        return name;
    }
    public double getSalary()
    {
        return salary;
    }
    public void raiseSalary(double percent)
    {
        double raise = salary*percent/100;
        salary+=raise;
    }
}

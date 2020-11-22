package 第4章;
import java.util.*;
public class FourthIfive
{
    public static void main(String[] args)
    {
        var staff = new Employee2[3];
        staff[0]=new Employee2("harry",50000);
        staff[1]=new Employee2(60000);
        staff[2]=new Employee2();

        for(Employee2 e : staff)
            System.out.println("name=["+e.getName()+"],id={"+e.getId()+"},salary=("+e.getSalary()+")");
    }
}
class Employee2
{
    private static int nextId;

    private int id;
    private String name = "";
    private double salary;
    static
    {
        var generator = new Random();
        nextId = generator.nextInt(10000);
    }

    {
        id=nextId;
        nextId++;
    }
    public Employee2(String n,double s)
    {
        name=n;
        salary=s;
    }
    public Employee2(double s)
    {
        this("Employee2 #"+nextId,s);
    }
    public Employee2()
    {
    }
    public String getName()
    {
        return name;
    }
    public double getSalary()
    {
        return salary;
    }
    public int getId()
    {
        return id;
    }
}

package 第4章;
import java.time.*;
public class FourthIseven
{
    private String name ;
    private double salary;
    private LocalDate hireDay;

    public FourthIseven(String name,double salary,int year,int month,int day)
    {
        this.name=name;
        this.salary=salary;
        hireDay=LocalDate.of(year, month ,day);
    }
    public String getName()
    {
        return name;
    }
    public double getSalary()
    {
        return  salary;
    }
    public LocalDate getHireDayday()
    {
        return hireDay;
    }
    public void raiseSalary(double bypercent)
    {
        double raise = salary*bypercent/100;
        salary+=raise;
    }
}

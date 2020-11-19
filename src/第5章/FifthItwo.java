package 第5章;

import java.time.*;
import java.util.Objects;

public class FifthItwo
{}
class Employee
{
    private String name;
    private double salary;
    private LocalDate birthday;
    public Employee(String n,double s,int year,int month,int day)
    {
        this.name=n;
        this.salary=s;
        birthday=LocalDate.of(year,month, day);
    }
    public String getName()
    {
        return name;
    }
    public double getSalary()
    {
        return salary;
    }
    public LocalDate getBirthday()
    {
        return birthday;
    }
    public void raiseSalary(double bypercent)
    {
        double raise=salary*bypercent/100;
        salary+=raise;
    }
    public boolean equals(Object otherObject)
    {
        if(this==otherObject)
            return true;
        if(otherObject==null)
            return false;
        if(getClass()!=otherObject.getClass())
            return false;
        var other = (Employee) otherObject;
        return Objects.equals(name,other.name)
                &&salary==other.salary
                &&Objects.equals(birthday,other.birthday);
    }
    public int hadeCode()
    {
        return Objects.hash(name,salary,birthday);
    }
    public String toString()
    {
        return getClass().getName()+"[name="+name+",salary="+salary+",birthDay="+birthday+"]";
    }
}

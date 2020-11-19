package 第5章;

import java.util.Objects;

public class FifthIthree{
}
class Manager extends Employee
{
    private double bouns;

    public Manager(String name,double salary,int year,int month,int day)
    {
        super(name,salary,year,month,day);
        bouns=0;
    }
    public double getSalary()
    {
        double baseSalary=super.getSalary();
        return baseSalary+=bouns;
    }
    public void setBouns(double b)
    {
        this.bouns=b;
    }
    public boolean equals(Object otherObject)
    {
        if(!super.equals(otherObject))
            return false;
        var other=(Manager)otherObject;
        return bouns==other.bouns;
    }
    public int hashCode()
    {
        return java.util.Objects.hash(super.hashCode(),bouns);
    }
}
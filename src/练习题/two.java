package 练习题;
import java.util.*;
public class two
{
    public static void main(String[] args)
    {
        person[] every = new person[1];
        every[0] = new person("haku",18);
        System.out.println("name="+every[0].getName()+",age="+every[0].getAge());

    }
}
class person
{
    private String name;
    private int age;

    public person(String n,int a)
    {
        this.name = n;
        this.age = a;

    }

    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return  age;
    }
}
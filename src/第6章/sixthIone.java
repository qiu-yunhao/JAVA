package 第6章;
import java.util.*;
public class sixthIone
{
    public static void main(String[] args)
    {
        var staff=new Employee[3];
        staff[0]=new Employee("haku",50000);
        staff[1]=new Employee("Miku",52000);
        staff[2]=new Employee("Laku",52000);
        Arrays.sort(staff);
        for (Employee e:staff)
        {
            System.out.println("name="+e.getName()+",薪水="+e.getSalary());
        }

    }
}

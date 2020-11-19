package 第5章;
import java.util.*;
public class FifthIeleven
{
    public static void main(String[] args)
    {
        var staff=new ArrayList<Employee>();
        staff.add(new Employee("haku",52000,2002,8,3));
        staff.add(new Employee("miku",52000,2002,8,3));
        staff.add(new Employee("Laku",52000,2002,8,3));
        for(Employee e:staff)
        {
            e.raiseSalary(5);
            System.out.println("名字:"+e.getName()+" 薪水:"+e.getSalary()+" 生日:"+e.getBirthday());
        }
    }
}

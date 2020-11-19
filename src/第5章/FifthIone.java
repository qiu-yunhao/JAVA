package 第5章;

public class FifthIone
{
    public static void main(String[] args)
    {
        var boss = new Manager("Carl",80000,1987,12,15);
        boss.setBouns(5000);
        var staff = new Employee[3];
        staff[0]=boss;
        staff[1]=new Employee("miku",13140,2002,8,3);
        staff[2]=new Employee("haku",52000,2002,8,3);
        for(Employee e:staff)
        {
            System.out.println("name={"+e.getName()+"},salary=["+e.getSalary()+"]");
        }
    }
}


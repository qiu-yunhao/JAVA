package 第6章;
import java.util.Date;
import java.util.GregorianCalendar;
public class SixthIfive {
}
class goddess implements Cloneable
{
    private String name;
    private double salary;
    private Date birthDay;
    public goddess(String n,double s)
    {
        this.name=n;
        this.salary=s;
        birthDay=new Date();
    }
    public goddess clone() throws CloneNotSupportedException
    {
        goddess cloned=(goddess)super.clone();
        cloned.birthDay=(Date)birthDay.clone();
        return cloned;
    }
    public void setbirthDay(int year,int month,int day)
    {
        Date newbirthDay=new GregorianCalendar(year,month-1,day).getTime();
        birthDay.setTime(newbirthDay.getTime());
    }
    public void raiseSalary(double bypercent)
    {
        double raise=salary*bypercent/100;
        salary+=raise;
    }
    public String toString()
    {
        return "goddess{名字："+name+",年薪："+salary+"生日："+birthDay+"}";
    }
}

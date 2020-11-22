package 第4章;
import static java.lang.System.*;
public class FourthIsix
{
    public static void main(String[] args)
    {
        var haku = new Employee("白羽祺",500000,2002,8,3);
        haku.raiseSalary(5);
        out.println("name={"+haku.getName()+"},salary=["+haku.getSalary()+"]");
    }
}

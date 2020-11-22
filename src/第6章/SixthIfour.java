package 第6章;

public class SixthIfour
{
    public static void main(String[] args)throws CloneNotSupportedException
    {
        goddess original=new goddess("白羽祺",50000);
        original.setbirthDay(2002,8,3);
        goddess copy=original.clone();
        copy.raiseSalary(10);
        copy.setbirthDay(2001,10,12);
        System.out.println("original="+original);
        System.out.println("copy="+copy);
    }
}

package 练习题.题16;

public class ten
{
    public static void main(String[] args)
    {
        StaticDemo x=new StaticDemo();
        System.out.printf("%d %d\n",x.a,x.b);
    }
}
class StaticDemo
{
    static int a=5;
    int b=10;
}

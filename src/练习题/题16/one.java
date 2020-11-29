package 练习题.题16;
import java.util.Scanner;
public class one
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入两个数");
        double n1=input.nextDouble();
        double n2=input.nextDouble();
        NUMBER num1=new NUMBER(n1,n2);
        NUMBER num2=new NUMBER(n1,n2);
        NUMBER num3=new NUMBER(n1,n2);
        NUMBER num4=new NUMBER(n1,n2);
        num1.add();
        num2.dif();
        num3.mul();
        num4.sub();
    }
}
class NUMBER
{
    private double n1;
    private double n2;
    public NUMBER(double n1,double n2)
    {
        this.n1=n1;
        this.n2=n2;
    }
    public  void add()
    {
        double add = n1+n2;
        System.out.printf("两数之和是：%f\n",add);
    }
    public void dif()
    {
        double dif = n1-n2;
        System.out.printf("两数之差是：%f\n",dif);
    }
    public  void mul()
    {
        double mul = n1*n2;
        System.out.printf("两数之积是：%f\n",mul);
    }
    public void sub()
    {
        double sub = n1/n2;
        System.out.printf("两数之商是：%f'\n",sub);
    }
}

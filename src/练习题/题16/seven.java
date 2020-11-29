package 练习题.题16;
import java.util.Scanner;
public class seven
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("请选择类型（1...int/2...double/3...short/4...float）");
        int x=input.nextInt();
        switch(x)
        {
            case 1:
                System.out.println("请输入两个数:");
                int n1=input.nextInt();
                int n2=input.nextInt();
                Addition add1=new Addition(n1,n2);
                System.out.println("结果是："+add1.a1(n1,n2));
                break;
            case 2:
                System.out.println("请输入两个数:");
                double n3=input.nextDouble();
                double n4=input.nextDouble();
                Addition add2=new Addition(n3,n4);
                System.out.println("结果是："+add2.a2(n3,n4));
                break;
            case 3:
                System.out.println("请输入两个数:");
                short n5=input.nextShort();
                short n6=input.nextShort();
                Addition add3=new Addition(n5,n6);
                System.out.println("结果是："+add3.a3(n5,n6));
                break;
            case 4:
                System.out.println("请输入两个数:");
                float n7=input.nextFloat();
                float n8=input.nextFloat();
                Addition add4=new Addition(n7,n8);
                System.out.println("结果是："+add4.a4(n7,n8));
                break;
        }
    }
}
class Addition {
    private int n1;
    private int n2;

    public Addition(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }
    public int a1(int n1,int n2)
    {
        return n1+n2;
    }

    private double n3;
    private double n4;

    public Addition(double n3, double n4) {
        this.n3 = n3;
        this.n4 = n4;
    }

    public double getN3() {
        return n3;
    }

    public double getN4() {
        return n4;
    }
    public double a2(double n3,double n4)
    {
        return n3+n4;
    }

    private long n5;
    private long n6;

    public Addition(long n5, long n6) {
        this.n5 = n5;
        this.n6 = n6;
    }

    public long getN5() {
        return n5;
    }
    public long getN6() {
        return n6;
    }
    public long a3(long n5,long n6)
    {
        return n5+n6;
    }
    private float n7;
    private float n8;

    public Addition(float n7, float n8) {
        this.n7 = n7;
        this.n8 = n8;
    }

    public float getN7() {
        return n7;
    }

    public float getN8() {
        return n8;
    }
    public float a4(float n7,float n8)
    {
        return n7+n8;
    }
}

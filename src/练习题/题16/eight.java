package 练习题.题16;
import java.util.Scanner;
public class eight
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入汽车型号：");
        System.out.print("请输入汽车轮胎数:");
        int n1=input.nextInt();
        String n4=input.nextLine();
        System.out.print("请输入汽车颜色:");
        String n2=input.nextLine();
        System.out.print("请输入汽车载重：");
        int n3=input.nextInt();
        CAr c=new CAr(n1,n2,n3);
        System.out.println("轮子数是： "+c.getLun()+"  颜色是： "+c.getColor()+"  载重为: "+c.getWeight()+"t");
        System.out.println("功能有：");
        System.out.print("1.");c.run();
        System.out.print("2.");c.speed();
        System.out.print("3.");c.slow();
    }
}
class CAr
{
    private int lun;
    private String color;
    private int weight;
    public CAr(int l,String c,int w)
    {
        this.lun=l;
        this.color=c;
        this.weight=w;
    }
    public int getLun()
    {
        return lun;
    }
    public String getColor()
    {
        return color;
    }

    public int getWeight() {
        return weight;
    }
    public void run()
    {
        System.out.println("前进，我已经在跑了!");
    }
    public void speed()
    {
        System.out.println("加速，芜湖!");
    }
    public void slow()
    {
        System.out.println("减速，跑这么慢还想写代码？！");
    }

}
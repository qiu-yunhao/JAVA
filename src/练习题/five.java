package 练习题;
import java.util.Scanner;
public class five
{
    public static  void main(String[] args)
    {
        var c1=new car("1","white",5);
        c1.Carshow();
        c1.run();
        var t1=new truck("2","white",1000);
        t1.Truckshow();
        t1.run();
    }


}
class Vehicles
{
    private String brand;
    private String color;
    public Vehicles(String b,String c)
    {
        this.brand=b;
        this.color=c;
    }
    public String getBrand()
    {
        return brand;
    }
    public String getColor()
    {
        return color;
    }
    public void run()
    {
        System.out.println("我已经正在跑了！");
    }
}
class car extends Vehicles
{
    private int seats;
    public car(String b,String c,int s)
    {
        super(b,c);
        this.seats=s;
    }
    public int getSeats()
    {
        return  seats;
    }
    public void Carshow()
    {
        System.out.println("品牌为= "+getBrand()+" ,颜色为= "+getColor()+" 座位数是： "+getSeats());
    }
}
class truck extends Vehicles
{
    private float load;
    public truck(String b,String c,float l)
    {
        super(b,c);
        this.load=l;
    }

    public float getLoad()
    {
        return load;
    }
    public void Truckshow()
    {
        System.out.println("品牌为= "+getBrand()+" ,颜色为= "+getColor()+" 载重为： "+getLoad());
    }
}


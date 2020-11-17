package 练习题;

public class eleven
{
    public static void main(String[] args)
    {
        ATUO []wdnmd=new ATUO[2];
        wdnmd[0]=new ATUO(1,"white",5,6);
        wdnmd[1]=new Car(2,"black",6,8);
        for(ATUO a:wdnmd)
        {
            System.out.println("轮子数={ "+a.getLun()+" },颜色是:[ "+a.getColor()+" ],载重是=（"+a.getWeight()+"），速度为："+a.getSpeed());
        }//为什么wdnmd【1】不能使用accelerate？
    }
}
class ATUO
{
    private int lun;
    private String color;
    private double weight;
    private int speed;
    public ATUO(int l,String c,double w,int v)
    {
        this.lun=l;
        this.color=c;
        this.weight=w;
        this.speed=v;
    }

    public int getLun() {
        return lun;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }
}
class Car extends ATUO
{
    public Car(int l,String c,double w,int v) {
        super(l,c,w,v );
    }
    public void accelerate()
    {
        System.out.println("这一波我没有闪！");
    }
    public void slowdown()
    {
        System.out.println("你这是在为难我这个19岁的老同志");
    }
}
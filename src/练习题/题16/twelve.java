package 练习题.题16;

public class twelve
{
    public static void main(String[] args)
    {
        var wdnmd = new Vehicle[2];
        wdnmd[0]=new CAR();
        wdnmd[1]=new Motorbike();
        for(Vehicle e:wdnmd)
        {
            System.out.println(e.NoOfWheels());
        }

    }
}
abstract class Vehicle {
    public abstract String NoOfWheels();
}

class CAR extends Vehicle
{
    public String NoOfWheels() {
        return "四轮车";
    }
}
class Motorbike extends Vehicle
{
    public String NoOfWheels()
    {
        return "两轮车";
    }
}


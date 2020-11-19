package 第5章;

public class FifthIeight
{
    public static void main(String[] args)
    {
        var alice1=new Employee("Alice",75000,1987,12,15);
        var alice2=alice1;
        var alice3=new Employee("Alice ",7500,1987,12,16);
        var bob=new Employee("Bob",1988,15000,1,13);
        System.out.println("alice1==aclice2"+(alice1==alice2));
        System.out.println("alice1==aclice2"+(alice1==alice3));
        System.out.println("alice1.equals(aclice2)"+(alice1.equals(alice2)));
        System.out.println("alice1.equals(bob)"+(alice1.equals(bob)));
        System.out.println("bob.toString():"+bob);
        var carl=new Manager("carl",80000,1999,3,30);
        var boss=new Manager("carl",80000,1999,3,30);
        boss.setBouns(5000);
        System.out.println("boss.toString():"+boss);
        System.out.println("carl.equals(boss):"+carl.equals(boss));
        System.out.println("alice1.hashCode()"+alice1.hashCode());
        System.out.println("alice3.hashCode()"+alice3.hashCode());
        System.out.println("bob.hashCode()"+bob.hashCode());
        System.out.println("Carl.hashCode()"+carl.hashCode());
    }
}

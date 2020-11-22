package 第3章.例题;
import java.util.*;

public class thirdIthree
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

                System.out.print("How old are you?");
                double goal=in.nextDouble();

                System.out.print("How much money do you want to contribute every year ? ");
                double payment=in.nextDouble();

                System.out.print("Internet rate in % :");
                double interestRate=in.nextDouble();

                double balance = 0;
                int years = 0;

                while(balance<goal)
                {
                    balance += payment;
                    double interest = balance * interestRate/100;
                    balance += interest;
                    years++;
                }
                System.out.println("you can retire in " + years  + " years.");
    }
}

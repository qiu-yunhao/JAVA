package 第3章.例题;
import java.util.*;

public class thirdIfour
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("How much money will you contribute every year ?");
        double payment = in.nextDouble();

        System.out.print("Interest rate i % :");
        double interestRate = in.nextDouble();

        double balance = 0;
        int year =0;

        String input;

        do{
            balance += payment;
            double interest = balance * interestRate/100;
            balance += interest;

            year++;

            System.out.printf("After year %d,your balance is %,.2f\n",year,balance);

            System.out.print("Readt to retire?(Y/N)");
            input = in.next();
        }while(input.equals("N"));
    }
}

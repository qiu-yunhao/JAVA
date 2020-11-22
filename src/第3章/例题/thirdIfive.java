package 第3章.例题;
import java.util.*;

public class thirdIfive
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);

        System.out.print("How many numbers do you want to draw ?");
        int k=in.nextInt();

        System.out.print("Whatis the highest number do you want to draw?");
        int n=in.nextInt();

        int lotteryOdds=1;
        for(int i=1;i<k;i++)
            lotteryOdds=lotteryOdds*(n+1-i)/i;
        System.out.println("Your odds are 1 in " + lotteryOdds + " . Good luck!");

    }
}

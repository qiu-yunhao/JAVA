package 第3章.例题;

public class thirdInine
{
    public static void main(String[] args)
    {
        final double STARTATE = 10;
        final int NRATES = 6;
        final int NYEAR = 10;

        double [] interestRate = new double [NRATES];
        for(int j=0;j<interestRate.length;j++)
            interestRate[j]=(STARTATE+j)/100.0;

        double[][] balance =new double[NYEAR][NRATES];

        for(int j=0;j<balance[0].length;j++)
        {
            balance[0][j] = 10000;

        }

        for(int i=1;i<balance[i].length;i++)
        {
            for(int j=0;j<balance[0].length;j++)
            {
                double oldBalance = balance[i-1][j];
                double interest = oldBalance*interestRate[j];
                balance[i][j] = oldBalance + interest;
            }
        }
        for (int j=0;j<interestRate.length;j++)
            System.out.printf("%9.0f%%", 100 * interestRate[j]);
        System.out.println();
        for(double[] row : balance)
        {
            for (double b : row)
                System.out.printf("%10.2f",b);
            System.out.println();
        }


    }
}

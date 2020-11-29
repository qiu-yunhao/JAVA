package 练习题.quiz;

public class 第2题
{
    public static void main(String[] args)
    {
        int[] v=new int [4];
        for(int i =0;i<4;i++)
        {
            v[i]=i+1;
        }
        t(v);

    }
    public static void t(int v[])
    {
        for(int i=0;i<v.length;i++)
        {
            System.out.printf("%3d\n",v[i]);
        }
    }
}


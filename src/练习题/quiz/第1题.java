package 练习题.quiz;

import java.util.Scanner;

public class 第1题 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入两个整数：");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int x = n1;
        int y = n2;
        if (n1 < n2) {
            int a = n1;
            n1 = n2;
            n2 = a;
        }
        int b = 1;
        while (b != 0) {
            b = n1 % n2;
            n1 = n2;
            n2 = b;
        }
        int c = n1;
        System.out.println("最大公约数是" + c);
        int d = x * y / c;
        System.out.println("最小公倍数是" + d);
    }
}

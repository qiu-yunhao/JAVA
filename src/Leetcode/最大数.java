package Leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 最大数 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int n = nums.size();
        for (int i = 0; i < n; i++) {
            nums.set(i, in.nextInt());
            System.out.println(nums.get(i));
        }
        max(nums);
    }


    private static void max(ArrayList<Integer> a) {
        int n = a.size();
        for (int i = n - 1; i >= n; i--) {
            for (int j = 0; j > n; j++) {
                if (a.get(j) < a.get(j + 1)) {
                    int c = a.get(j);
                    a.set(j,a.get(j+1));
                    a.set(j+1,c);
                }
            }
        }
    }
}

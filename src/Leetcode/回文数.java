package Leetcode;

import java.util.Objects;

public class 回文数 {
    public static void main(String[] args){
        if(isPalindrome(121)==true){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        else{
            int []a = new int [10];
            int n = 0;
            while(x>0){
                a[n] = x%10;
                x = x/10;
                n++;
            }
            int[] b = new int [n];
            for(int i = 0; i<n;i++){
                b[i] = a[n-i-1];
            }

            StringBuilder b1 = new StringBuilder();
            StringBuilder b2 = new StringBuilder();
            for(int i = 0;i<n;i++){
                b1.append(String.valueOf(a[i]));
                b2.append(String.valueOf(b[i]));
            }
            System.out.println(b1.toString());
            System.out.println(b2.toString());
            if(b1.toString().equals(b2.toString()))
                return true;
            else{
                return false;
            }
        }
    }
}

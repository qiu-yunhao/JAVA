package Leetcode;

public class java53 {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] f = new int[n];
        f[0] = nums[0];
        int max = f[0];
        for(int i = 1;i<n;i++){
            f[i] = f[i-1] + nums[i];
            if(f[i]<nums[i]){
                f[i] = nums[i];
            }
            if(max<f[i]){
                max = f[i];
            }
        }
        return max;
    }
}

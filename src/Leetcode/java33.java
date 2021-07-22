package Leetcode;

public class java33 {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int t = -1;
        for(int i = 0;i<n;i++){
            if(nums[i]==target){
                t = i;
            }
        }
        return t;
    }
    /*这道题就就挺离谱的，就这样简简单单的写完，看了答案才知道想叫人用二分法...
    * 这不比2分法热血？？？*/
}

package com.example.tangtang.boot.launch.LeetCodeSolution;

import java.util.Arrays;


public class ALi2 {
    public static void main(String[] args) {
        int interpret = maxOperations(new int[] {3,1,3,4,3},6);
        System.out.println(interpret);
    }
    public static int maxOperations(int[] nums, int k) {
        int len=nums.length;
        Arrays.sort(nums);
        int left=0,right=len-1;
        int res=0;
        while (left<right)
        {
            if(nums[left]+nums[right]>k)
                right--;
            else if(nums[left]+nums[right]<k)
                left++;
            else {
                right--;
                left++;
                res++;
            }
        }
        if(res==0)
            return -1;
        return res;
    }
}

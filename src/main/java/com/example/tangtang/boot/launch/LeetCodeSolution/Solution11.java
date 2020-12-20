package com.example.tangtang.boot.launch.LeetCodeSolution;

import java.util.ArrayList;
import java.util.List;

public class Solution11 {

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
    public static int maxSubArray(int[] nums) {
        int n=nums.length;
        if(n==1)
            return nums[0];
        int right=0;
        int sum=0;
        int summax=Integer.MIN_VALUE;
        while (right<n)
        {

            sum+=nums[right];
            if(sum<nums[right])
            {


                sum=nums[right];
            }
            if(sum>summax)
                summax=sum;

            right++;

        }
        return summax;



    }
}

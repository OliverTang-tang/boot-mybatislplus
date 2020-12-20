package com.example.tangtang.boot.launch.LeetCodeSolution;

import java.util.Arrays;

public class Solution7 {

    public static void main(String[] args) {
        int i = firstMissingPositive(new int[]{0,2,2,4,0,1,0,1,3});
        System.out.println(i);


    }
    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        if(nums==null||nums.length==0)
            return 1;
        int len=nums.length;
        if(nums[len-1]<1 || nums[0]>1 )
            return 1;
        int start=0;int end=len-1;
        int k=-1;
        while (start<=end)
        {
            int mid=(start+end)/2;
            if(nums[mid]<=0 &&nums[mid+1]>0)
            {
                k=mid;
                break;
            }

            if(nums[mid]<=0 && nums[mid+1]<=0)
                start=mid+1;
            if(nums[mid]>0)
                end=mid-1;
        }
        k=k+1;
        if(nums[k]>1)
            return 1;
        int res=nums[len-1]+1;
        for(int i=k+1;i<=len-1;i++)
        {
            if(nums[i]-nums[i-1]>1)
            {
                res= nums[i-1]+1;
                break;
            }
        }
        return res;

    }

}

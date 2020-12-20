package com.example.tangtang.boot.launch.LeetCodeSolution;

import java.util.Arrays;

public class Solution5 {

    public static void main(String[] args) {
        int[] res = searchRange(new int[]{1,3}, 1);
        for (int i:res) {
            System.out.println(i);
        }



    }
    public static   int[] searchRange(int[] nums, int target) {
        int len=nums.length;
        int start=0;int end=len-1;
        int num=-1;
        int res[]=new int[]{-1,-1};
        while (start <=end) {
            int mid=(start+end)/2;
            if(target==nums[mid])
            {
                num=mid;
                break;
            }
            if(target>nums[mid])
                start=mid+1;
            if(target<nums[mid])
                end=mid-1;
        }
        if(num==-1)
            return res;
        if(nums[0]==nums[len-1]&&nums[0]==target)
            return res=new int[]{0,len-1};
        int start1=0;int end1=num;
        int num1=-1;

            while (start1 <=end1) {
                int mid1=(start1+end1)/2;
                if(nums[mid1]!=target && target==nums[mid1+1])
                    num1=mid1;
                if(target>nums[mid1])
                    start1=mid1+1;
                if(target==nums[mid1])
                    end1=mid1-1;
            }


        int start2=num;int end2=len-1;
        int num2=len;

            while (start2 <= end2) {
                int mid2 = (start2 + end2) / 2;
                if (nums[mid2] != target && target == nums[mid2 - 1]  )
                    num2 = mid2;
                if (target < nums[mid2])
                    end2 = mid2 - 1;
                if (target == nums[mid2])
                    start2 = mid2 + 1;
            }



        res=new int[]{num1+1,num2-1};
        return res;

    }

}

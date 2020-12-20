package com.example.tangtang.boot.launch.LeetCodeSolution;

import java.util.Arrays;

public class Solution3 {

    public static void main(String[] args) {
        nextPermutation(new int[]{1,2,3});

    }

    public static void nextPermutation(int[] nums) {
        int[] res=new int[nums.length];
        int k=0;
        boolean flag=false;
        for (int i:nums
        ) {
           res[k]=i;
           k++;
        }
        for(int i=nums.length-2;i>=0;i--)
        {
            int rep;
            for(int j=nums.length-1;j>i;j--)
            {
                if(nums[i] < nums[j])
                {
                    rep=nums[i];
                    nums[i]=nums[j];
                    nums[j]=rep;
                    flag=true;
                    break;
                }
            }
            if (flag)
            {
                Arrays.sort(nums,i+1,nums.length);
                break;
            }


        }
        if(Arrays.equals(nums,res))
            Arrays.sort(nums);
        for (int i:nums
             ) {
            System.out.println("值是"+i);

        }

    }

}

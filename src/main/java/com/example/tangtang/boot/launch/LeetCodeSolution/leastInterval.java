package com.example.tangtang.boot.launch.LeetCodeSolution;

import java.util.*;

public class leastInterval {
    public static void main(String[] args) {
        int i = leastInterval(new int[]{3, 3, 2, 4, 5, 6}, 2);
        System.out.println(i);
    }

    public static int leastInterval(int[] nums, int k) {
        int res = 0;
        HashMap<Integer,Integer> map=new HashMap<>();

        int maxcount=0;
        for (int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0));
            if(map.get(nums[i])!=0)
                map.put(nums[i],map.get(nums[i])+1);
            maxcount=Math.max(maxcount,map.get(nums[i]));
        }

        if(maxcount>k)
            return -1;

        return res;
    }
}

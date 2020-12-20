package com.example.tangtang.boot.launch.LeetCodeSolution;

import java.util.Arrays;

public class Solution4 {

    public static void main(String[] args) {
        int res = search(new int[]{6,7,8,1,2,3,4,5}, 6);
        System.out.println(res);

    }
    public static int  search(int[] nums, int target) {
        int len=nums.length;
        int start=0;
        int end=len-1;
        if (len==1&&nums[0]!=target)
            return -1;
        if (len==1&&nums[0]==target)
            return 0;
        int k=end/2;
        while (nums[k]<nums[k+1]) {
            if (nums[k] > nums[len-1]) {
                start=k+1;
                k = (k +1 + end) / 2;
               // start=k+1;
            }

            if (nums[k] < nums[len-1]) {
                end=k-1;
                k = (k-1  + start) / 2;
                //end=k-1;
            }
            if(nums[0]<nums[len-1])
               {
                   int ress = myBinarySearch(nums, target);
                   return ress;
               }
        }
        if(target==nums[len-1])
            return len-1;
        int res=0;
        if(target>nums[len-1])
        {
            int arr2[]=Arrays.copyOfRange(nums,0,k+1);
            res = myBinarySearch(arr2, target);

        }
        if(target<nums[len-1])
        {
            int arr2[]=Arrays.copyOfRange(nums,k+1,len);
            res = myBinarySearch(arr2, target);
            if (res!=-1)
                res=res+k+1;

        }
        return res;

    }
    public static int myBinarySearch(int[] arr,int value) {
        int low=0;
        int high=arr.length-1;
        while(low<=high) {
            int mid=(low+high)/2;
            if(value==arr[mid]) {
                return mid;
            }
            if(value>arr[mid]) {
                low=mid+1;
            }
            if(value<arr[mid]) {
                high=mid-1;
            }

        }
        return -1;//没有找到返回-1
    }
}

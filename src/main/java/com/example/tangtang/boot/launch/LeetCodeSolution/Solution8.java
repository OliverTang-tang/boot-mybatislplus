package com.example.tangtang.boot.launch.LeetCodeSolution;

import java.util.Arrays;

public class Solution8 {

    public static void main(String[] args) {
        int[] ints = plusOne(new int[]{9});
        for (int i:ints
             ) {
            System.out.println(i);
        }



    }
    public static int[] plusOne(int[] digits) {
        int len=digits.length;
        if(len==1&&digits[0]==0)
            return new int[]{1};
        for(int i=len-1;i>=0;i--)
        {
            if (digits[i]==9)
            {
                digits[i]=0;
                continue;
            }

            digits[i]=digits[i]+1;
            break;
        }
        return digits;
    }

}

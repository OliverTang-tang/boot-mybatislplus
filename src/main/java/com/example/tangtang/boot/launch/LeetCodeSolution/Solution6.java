package com.example.tangtang.boot.launch.LeetCodeSolution;

public class Solution6 {

    public static void main(String[] args) {
        String res = countAndSay(5);
        System.out.println(res);



    }
    public static String countAndSay(int n) {
        if(n==1)
            return 1+"";
        StringBuilder sb=new StringBuilder("");
        String nums = countAndSay(n - 1);
        char[] chars = nums.toCharArray();
        int k=1;
        for(int i=1;i<nums.length();i++)
        {
            if(chars[i]==chars[i-1] )
            {
                k++;
                continue;
            }
            if(k!=1)
            {
                sb.append(k);
                sb.append(chars[i-1]);
            }
            if(k==1)
            {
                sb.append(1);
                sb.append(chars[i-1]);
            }
            if(chars[i]!=chars[i-1] )
            {
                k=1;
                continue;
            }
        }
        sb.append(k);
        sb.append(chars[nums.length()-1]);
        String res = sb.toString();
        return res;


    }

}

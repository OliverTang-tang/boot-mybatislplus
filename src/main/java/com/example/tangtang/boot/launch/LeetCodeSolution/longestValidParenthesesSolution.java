package com.example.tangtang.boot.launch.LeetCodeSolution;

public class longestValidParenthesesSolution {
    public static void main(String[] args) {
        System.out.println(longestValidParentheses("((()))())"));
    }
    public static int longestValidParentheses(String s) {
        int res=0;

        //用来记录字符串中每个字符对应位置（）的最大值
        int[] dp=new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i)==')')
            {
                if(s.charAt(i-1)=='(')
                    dp[i]=  (i>=2 ? dp[i-2] : 0) +2;
                else if(i-dp[i-1]-1>=0&&s.charAt(i-dp[i-1]-1)=='(')
                    dp[i]=dp[i-1]+( i-dp[i-1]-2>=0  ? dp[i-dp[i-1]-2] :0 )+2;
                res=Math.max(res,dp[i]);
            }
        }
        return res;
    }
}

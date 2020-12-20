package com.example.tangtang.boot.launch.LeetCodeSolution;

import java.util.Arrays;
/*给你一个整数 n ，请你将 1 到 n 的二进制表示连接起来，并返回连接结果对应的 十进制 数字对 109 + 7 取余的结果。

 

示例 1：

输入：n = 1
输出：1
解释：二进制的 "1" 对应着十进制的 1 。
示例 2：

输入：n = 3
输出：27
解释：二进制下，1，2 和 3 分别对应 "1" ，"10" 和 "11" 。
将它们依次连接，我们得到 "11011" ，对应着十进制的 27 。
示例 3：

输入：n = 12
输出：505379714
解释：连接结果为 "1101110010111011110001001101010111100" 。
对应的十进制数字为 118505380540 。
对 109 + 7 取余后，结果为 505379714 。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/concatenation-of-consecutive-binary-numbers
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
/*连接连续二进制数字*/
public class ALi3 {
    public static void main(String[] args) {
        int interpret = concatenatedBinary(12);
        System.out.println(interpret);
    }
    public static int concatenatedBinary(int n) {
        //记录结果，初始值为0
        int res=0;
        //题目中取模的数
        int mod=1000000007;
        //定义一个数组，用来存放每次&1运算的值
        int num[]=new int[40];
        for(int i=1;i<=n;i++)
        {
            int current=0,tmp=i;//第一个变量用来记录从低位到高位拼接字符串二进制的各位数、第二个代表数字几，拼接上去
            while (tmp>0)
            {
                //&1运算是将数字化为2进制与1做与运算，两者同为1时才为1
                num[current++]=tmp&1;
                //向右缩小数
                tmp>>=1;
            }
            //把各个数拼接到结果的后面
            for (int j = current-1; j >= 0; j--) {
                //数位左移，数字扩大，二进制为后面加0
                res <<=1;
                //如果改位为1的话，二进制位+1，则结果也是加1
                if(num[j]>0)
                    res=res+1;
                //只要大于模数，就减去
                if(res>=mod) res-=mod;
            }
        }
        return res;
    }
}

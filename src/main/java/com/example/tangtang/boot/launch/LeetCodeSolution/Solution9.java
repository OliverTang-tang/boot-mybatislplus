package com.example.tangtang.boot.launch.LeetCodeSolution;

public class Solution9 {

    public static void main(String[] args) {
        String multiply = multiply("123456789", "987654321");
        System.out.println(multiply);


    }
    public static String multiply(String num1, String num2) {
        int len1=num1.length();
        int len2=num2.length();
        StringBuilder[] sb=new StringBuilder[len2];
        if(num1.charAt(0)=='0'||num2.charAt(0)=='0')
            return "0";
       /* for(int m=0;m<len2-1;m++)
            sb[m]=new StringBuilder();*/
        int k;
        for(int i=len2-1;i>=0;i--)
        {
            k=0;
            sb[len2-1-i]=new StringBuilder();
            for(int j=len1-1;j>=0;j--)
            {
                int mid=(num2.charAt(i)-'0')*(num1.charAt(j)-'0');
                sb[len2-1-i].append((mid+k)%10);
                k=(mid+k)/10;
            }
            if(k!=0)
                sb[len2-1-i].append(k);
            sb[len2-1-i].reverse();
            for(int l=0;l<(len2-1-i);l++)
                sb[len2-1-i].append(0);
           /* System.out.println(sb[len2-1-i].toString());*/
        }
        int maxlen=sb[sb.length-1].length();
        StringBuilder res=new StringBuilder();
        int ans=0;
        int ansk=0;
        for(int a=0;a<maxlen;a++)
        {
            for(int n=0;n<len2;n++)
            {
                if(sb[n].length() !=0)
                {
                    char c = sb[n].charAt(sb[n].length() - 1);
                    int numc=c-'0';
                    ans+=numc;
                    sb[n].deleteCharAt(sb[n].length() - 1);
                }

            }
            res.append((ans+ansk)%10);
            ansk=(ans+ansk)/10;
            ans=0;
        }
        if(ansk!=0)
            res.append(ansk);
        return (res.reverse().toString());

    }

}

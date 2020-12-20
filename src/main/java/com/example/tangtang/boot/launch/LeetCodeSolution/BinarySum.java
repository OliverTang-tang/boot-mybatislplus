package com.example.tangtang.boot.launch.LeetCodeSolution;

public class BinarySum {
    public static void main(String[] args) {
        System.out.println(addBinary("110000", "111"));
    }
    public static String addBinary(String a, String b) {
        int alen=a.length();
        int blen=b.length();
        int maxlen=Math.max(alen,blen);
        int minlen=Math.min(alen,blen);
        StringBuilder sb=new StringBuilder();
        int flag=0;
        for(int i=minlen-1;i>=0;i--)
        {

            int sum=a.charAt(--alen)-'0'+b.charAt(--blen)-'0'+flag;
            if(sum==0)
            {
                sb.append(0);
                flag=0;
            }

            if(sum==1)
            {
                sb.append(1);
                flag=0;
            }

            if(sum==2)
            {
                sb.append(0);
                flag=1;
            }
            if(sum==3)
            {
                sb.append(1);
                flag=1;
            }
        }
        if(maxlen==minlen&&flag==1)
        {
            sb.append(1);
            return sb.reverse().toString();
        }
        if(flag==0)
        {

            String res=sb.reverse().toString();
            if(a.length()>b.length())
                res=a.substring(0,maxlen-minlen)+res;
            else
                res=b.substring(0,maxlen-minlen)+res;
            return res;
        }
        if(a.length()>b.length())
        {
            for(int i=maxlen-minlen-1;i>=0;i--)
            {
                if(a.charAt(i)-'0'==1&&a.charAt(i)-'0'==flag)
                {
                    sb.append(0);
                    flag=1;
                }
                else {
                    sb.append(a.charAt(i)-'0'+flag);
                    flag=0;
                }
            }
            if(flag==1)
                sb.append(1);
        }
        else{
            for(int i=maxlen-minlen-1;i>=0;i--)
            {
                if(b.charAt(i)-'0'==1&&b.charAt(i)-'0'==flag)
                {
                    sb.append(0);
                    flag=1;
                }
                else {
                    sb.append(b.charAt(i)-'0'+flag);
                    flag=0;
                }
            }
            if(flag==1)
                sb.append(1);
        }
        return  sb.reverse().toString();


    }
}

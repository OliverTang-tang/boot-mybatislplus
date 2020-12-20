package com.example.tangtang.boot.launch.LeetCodeSolution;

public class rebuildString {
    public static void main(String[] args) {
        String aab = reorganizeString("aaa");
        System.out.println(aab);
    }
    public static String reorganizeString(String S) {
        if(S.length()==1)
            return S;
        StringBuilder sb=new StringBuilder(S);
        int len=S.length();
        for(int i=1;i<len;i++)
        {
            if(sb.charAt(i)!=sb.charAt(i-1))
            {
                continue;
            }
            for(int j=0;j<len;j++)
            {
                if(j==0&&sb.charAt(0)!=sb.charAt(i))
                {
                    sb.insert(0,sb.charAt(i));
                    sb.deleteCharAt(i);
                    i--;
                    break;
                }
                if(j<len-1&&sb.charAt(j)!=sb.charAt(i)&&sb.charAt(j+1)!=sb.charAt(i))
                {
                    sb.insert(j+1,sb.charAt(i));
                    sb.deleteCharAt(i);
                    i--;
                    break;
                }
                if(j==len-1)
                {
                    sb.append(sb.charAt(i));
                    sb.deleteCharAt(i);
                    if(sb.charAt(j)==sb.charAt(j-1))
                       return "";
                    i--;
                }

            }


        }
        return sb.toString();
    }
}

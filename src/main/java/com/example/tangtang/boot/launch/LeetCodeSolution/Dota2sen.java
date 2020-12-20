package com.example.tangtang.boot.launch.LeetCodeSolution;

public class Dota2sen {
    public static void main(String[] args) {
        System.out.println(predictPartyVictory("RDR"));
    }
    public static String predictPartyVictory(String senate) {
        StringBuilder sb=new StringBuilder(senate);
        String a=new String("tangtang");
        String aintern = a.intern();

        while (!theSame(sb.toString()))
        {

            for (int i = 0; i < sb.length(); i++) {
                char c = sb.charAt(i);
                if(c=='R')
                {
                    if(theSame(sb.substring(i)))
                    {
                        if(theSame(sb.toString()))
                            return "Radiant";
                         sb.deleteCharAt(sb.indexOf("D"));
                    }

                    else
                        sb.deleteCharAt(sb.indexOf("D",i));
                }
                else
                {
                    if(theSame(sb.substring(i)))
                    {
                        if(theSame(sb.toString()))
                            return "Dire";
                        sb.deleteCharAt(sb.indexOf("R"));
                    }

                    else
                        sb.deleteCharAt(sb.indexOf("R",i));
                }
            }
        }
        if(sb.charAt(0)=='R')
            return "Radiant";
        return "Dire";
    }

    public static boolean theSame(String s)
    {
        int len = s.length();
        for (int i = 1; i < len; i++) {
            if(s.charAt(i)!=s.charAt(i-1))
                return false;
        }
        return true;
    }
}

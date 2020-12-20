package com.example.tangtang.boot.launch.LeetCodeSolution;

public class monotoneIncreasingDigits {
    public static void main(String[] args) {
        System.out.println(monotoneIncreasingDigits(989998));
    }
    public static int monotoneIncreasingDigits(int N) {
        //解题思路判断这个数值是否是按照递增的顺序排列的
        String RN=N+"";
        if(RN.length()==1)
            return N;
        StringBuilder sb=new StringBuilder();
        if(RN.charAt(0)=='1'&&RN.charAt(1)=='0')
        {
            for (int i = 1; i < RN.length(); i++) {
                sb.append(9);
            }
            return Integer.parseInt(sb.toString());
        }
        int k=RN.length()+1;
        for (int i = 1; i < RN.length(); i++) {
            if(RN.charAt(i)-'0'>=RN.charAt(i-1)-'0')
            {
                sb.append(RN.charAt(i-1)-'0');
                if(i== RN.length()-1)
                    sb.append(RN.charAt(i)-'0');
                continue;
            }
            if(sb.length()>0&&RN.charAt(i-1)==RN.charAt(i-2))
            {
                int index = sb.indexOf(String.valueOf(RN.charAt(i - 1) - '0'));
                sb.replace(index,index, String.valueOf(RN.charAt(index)-'0'-1));
                sb.delete(index+1,sb.length());
                k=index+1;
            }else
            {
                sb.append(RN.charAt(i-1)-'0'-1);
                k=i;
            }

            break;

        }

        for (int i = k; i < RN.length(); i++) {
            sb.append(9);
        }
        return Integer.parseInt(sb.toString());
    }
}

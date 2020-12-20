package com.example.tangtang.boot.launch.LeetCodeSolution;

public class generateMatrix {
    public static void main(String[] args) {
        int[][] ints = generateMatrix(4);
        for (int[] i:ints
             ) {
            for (int j:i
                 ) {
                System.out.println(j);
            }

        }
    }
    public static int[][] generateMatrix(int n) {
        int[][] res=new int[n][n];
        int start=1;
        int tmp=n;
        int tep=n*n;
        int i=0;
        while (start<tep)
        {
            circle(start,tmp,res,i++);
            start=(n-1)*4+start;
            n=n-2;
        }
        if(tmp%2!=0)
            res[res.length/2][res.length/2]=tep;
        return res;
    }

    public static void circle(int start,int n,int[][] res,int line)
    {

        for(int i=line;i<n-line-1;i++)
            res[line][i]=start++;
        for(int i=line;i<n-line-1;i++)
            res[i][n-line-1]=start++;
        for(int i=n-line-1;i>line;i--)
            res[n-line-1][i]=start++;
        for(int i=n-line-1;i>line;i--)
            res[i][line]=start++;


    }
}

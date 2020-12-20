package com.example.tangtang.boot.launch.LeetCodeSolution;

import java.util.HashMap;
import java.util.Map;

public class gridcount {

    public static void main(String[] args) {
        System.out.println(minSwaps(new int[][]{{0,0,1},{1,1,0},{1,0,0}}));
    }

    public static int minSwaps(int[][] grid) {
        int len=grid.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<len;i++)
        {
            int num=0;
            for(int j=len-1;j>=0;j--)
            {
                if(grid[i][j]!=0)
                    break;
                num++;
            }
            map.put(i,num);

        }
        int res=0;
        for(int m=0;m<len;m++)
        {
            if(map.get(m)>=len-1-m)
                continue;
            else {
                for(int n=m+1;n<len;n++)
                {
                    if(map.get(n)>=len-1-m)
                    {
                        int tmp=map.get(n);
                        for(int alpha=n;alpha>=m+1;alpha--)
                            map.put(alpha,map.get(alpha-1));
                        map.put(m,tmp);
                        res+=n-m;
                        break;
                    }
                    if(n==len-1)
                        return -1;
                }
            }
        }
        return res;

    }
    }


package com.example.tangtang.boot.launch.LeetCodeSolution;

import java.util.ArrayList;
import java.util.List;

public class Solution10 {

    public static void main(String[] args) {
        List<int[]>  list;
        list=new ArrayList<>();
        list.add(new int[]{10,40});
        list.add(new int[]{50,60});
        //book(25,55, (ArrayList<int[]>) list);
        System.out.println(book(25,55, (ArrayList<int[]>) list));
    }


    public static boolean book(int start, int end , ArrayList<int[]> list) {
        int k=1;
        List<int[]> list1=new ArrayList<>();
        for (int[] v:list
        ) {
            if(v[0]<end&&start<v[1])
            {
                for (int[] v1:list1
                ) {
                    if(v1[0]<Math.min(end,v[1])&&Math.max(start,v[0])<v1[1])
                        return false;
                }
                list1.add(new int[]{Math.max(start,v[0]),Math.min(end,v[1])});

            }
        }
        list.add(new int[]{start,end});
        return true;
    }
}

package com.example.tangtang.boot.launch.LeetCodeSolution;

import java.util.*;

public class guinei {

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        int n=strs.length;
        Map<String,List<String>> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String s = String.valueOf(chars);
            if(map.containsKey(s)) {
                List<String> list = map.get(s);
                list.add(strs[i]);
                map.put(s,list);
            }
            else{
                List<String> listElse = new ArrayList<>();
                listElse.add(strs[i]);
                map.put(s,listElse);
            }

        }
        Set<String> keySet = map.keySet();
        Iterator<String> it = keySet.iterator();
        while (it.hasNext())
        {
            List<String> list = map.get(it.next());
            res.add(list);
        }

        return res;

    }
}

package com.example.tangtang.boot.launch.LeetCodeSolution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class wordPatternLeetcode {
    public static void main(String[] args) {
        System.out.println(wordPattern("abbaa","dog cat cat dog"));
    }
    public static boolean wordPattern(String pattern, String s) {
        String[] strings = s.split(" ");

        if(strings.length!=pattern.length())
            return false;

        Map<Character, List<Integer>> map=new HashMap<>();

        Map<String, List<Integer>> map2=new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if(map2.get(strings[i])!=null)
            {
                List<Integer> list = map2.get(strings[i]);
                list.add(i);
                map2.put(strings[i],list);
            }
            else
            {
                List<Integer> list=new ArrayList<>();
                list.add(i);
                map2.put(strings[i],list);
            }


            if(map.get(c)!=null)
            {
                List<Integer> list = map.get(c);
                list.add(i);
                map.put(c,list);
                if(map.get(c).equals(map2.get(strings[i]))==false)
                    return false;
            }else
            {
                List<Integer> list=new ArrayList<>();
                list.add(i);
                map.put(c,list);
                if(map.get(c).containsAll(map2.get(strings[i]))==false)
                    return false;
            }

        }
        return true;

    }
}

package com.example.tangtang.boot.launch.LeetCodeSolution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class removeDuplicateLettersLearn {
    public static void main(String[] args) {
        System.out.println(removeDuplicateLetters("rusrbofeggbbkyuyjsrzornpdguwzizqszpbicdquakqws"));
    }
    public static String removeDuplicateLetters(String s) {
        StringBuilder sb=new StringBuilder(s.substring(0,1));

        List<Character> list=new ArrayList<>();
        list.add(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if(!list.contains(s.charAt(i)))
            {
                sb.append(s.charAt(i));
                list.add(s.charAt(i));

                continue;
            }else {
                int index = list.indexOf(s.charAt(i));
                int sblen = sb.length();
                for(int j=index+1;j<sblen;j++)
                {
                    if(Character.compare(sb.charAt(j),sb.charAt(j-1))>0)
                        continue;
                    if(j==index+1)
                        break;
                    if(s.indexOf(sb.substring(index,j),i)!=-1&& Character.compare(sb.charAt(index),sb.charAt(j))>0)
                        {
                            list.subList(index,j).clear();
                            sb.delete(index,j);
                            i--;

                        }
                    break;
                }
                if( index != sb.length()-1 && Character.compare(sb.charAt(index),sb.charAt(index+1))>0)
                {
                    list.remove(index);
                    sb.deleteCharAt(index);
                    sb.append(s.charAt(i));
                    list.add(s.charAt(i));
                }
                else
                    continue;
            }

        }
        return sb.toString();

    }
}

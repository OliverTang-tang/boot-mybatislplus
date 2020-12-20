package com.example.tangtang.boot.launch.LeetCodeSolution;

import java.util.HashMap;
import java.util.Map;

public class LemonChange {
    public static void main(String[] args) {
        boolean b = lemonadeChange(new int[]{5, 5, 5, 10, 20});
        System.out.println(b);
    }
    public static boolean lemonadeChange(int[] bills) {

        //根据题意，营业员没有零钱，第一位顾客的钱如果大于5则直接返回false
        if(bills[0]>5)
            return false;
        //营业员处金额
        int totalmoney=0;

        //用于存放营业员处 5、10、20 的个数
        Map<Integer,Integer> map=new HashMap<>();

        int num=5;
        //将5，10，20录入到map中
        for (int i = 0; i < 3; i++) {

            map.put(num,0);
            num=num*2;
        }

        int k,n;
        //判断当前顾客金额是否可以找开
        for(int i=0;i<bills.length;i++)
        {
            //条件一如果不满足，直接返回false
            if(totalmoney<bills[i]-5)
                return false;
            //条件二的判断

            //如果是5元，直接收入
            if(bills[i]==5)
            {
                k=map.get(5);
                ++k;
                map.put(bills[i],k);
            }

            else if(bills[i]==10)
            {
                if(map.get(5)==0)
                    return false;
                k=map.get(10);
                map.put(10,++k);
                n=map.get(5);
                map.put(5,--n);
            }
            else
            {
                if(map.get(10)>0&&map.get(5)>0)
                {
                    k=map.get(10);
                    map.put(10,--k);
                    n=map.get(5);
                    map.put(5,--n);
                }
                else if(map.get(5)>2)
                {
                    n=map.get(5)-3;
                    map.put(5,n);
                }
                else
                    return false;
            }

            totalmoney+=5;
        }
        return true;
    }

}

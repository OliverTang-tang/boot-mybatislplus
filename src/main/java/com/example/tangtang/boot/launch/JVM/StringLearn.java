package com.example.tangtang.boot.launch.JVM;

public class StringLearn {
    public static void main(String[] args) {


           String s1=new String("1")+new String("1");

           s1.intern();

           String s2="11";
           System.out.println(s2==s1);
           String s3=new String("a")+new String("a");
        System.out.println(s3==s3.intern());
           String s4=new String("b");
        System.out.println(s4==s4.intern());

    }
}

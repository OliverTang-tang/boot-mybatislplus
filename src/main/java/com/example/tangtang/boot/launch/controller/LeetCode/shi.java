package com.example.tangtang.boot.launch.controller.LeetCode;

import org.springframework.beans.factory.parsing.BeanComponentDefinition;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class shi {
    public static void main(String[] args) {
        int x=3;
        System.out.println(x-1);
        System.out.println(x-- -1);
        System.out.println(x);
        String str=new String("abc" );
        SoftReference<String> softReference=new SoftReference<>(str);
        System.out.println(softReference.get());
        WeakReference<String> weakReference=new WeakReference<>(new String("bcd"));
        System.out.println(weakReference.get());
        System.gc();
        System.out.println(weakReference.get());
    }
}

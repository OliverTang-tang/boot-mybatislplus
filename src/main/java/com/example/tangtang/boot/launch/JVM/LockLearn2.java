package com.example.tangtang.boot.launch.JVM;

import java.util.concurrent.TimeUnit;

public class LockLearn2 {
    public static void main(String[] args) {
        synchronized (LockLearn2.class)
        {
            System.out.println("这是一个悲观锁的演示");
        }
    }


}

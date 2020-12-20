package com.example.tangtang.boot.launch.JVM;

import java.util.concurrent.TimeUnit;

public class LockLearn {
    public static void main(String[] args) {
           deadlock();
    }
    private static void deadlock()
    {
        Object lock1=new Object();
        Object lock2=new Object();
        //线程1 拥有 lock1 试图获取lock2
        new Thread(()->{
            synchronized (lock1){
                System.out.println("获取 lock1 成功");
                try {
                    TimeUnit.SECONDS.sleep(3);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2){
                    System.out.println(Thread.currentThread().getName());
                }
            }
        }).start();
        //线程2 拥有 lock2 试图获取lock1
        new Thread(()->{
            synchronized (lock2){
                System.out.println("获取 lock2 成功");
                try {
                    TimeUnit.SECONDS.sleep(3);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1){
                    System.out.println(Thread.currentThread().getName());
                }
            }
        }).start();

    }

}

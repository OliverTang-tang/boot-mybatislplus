package com.example.tangtang.boot.launch.LeetCodeSolution;

public class ThreadExample2 {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("线程"+Thread.currentThread().getName());
                    if(i==5)
                        Thread.yield();
                }

            }
        };
        Thread t1=new Thread(runnable,"T1");
        Thread t2=new Thread(runnable,"T2");
        t1.start();
        t2.start();

    }
}

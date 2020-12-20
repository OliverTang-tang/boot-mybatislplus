package com.example.tangtang.boot.launch.JVM;

public class LockLearn3 {
    public static void main(String[] args) {
        reentrantA();
    }

    private synchronized static void reentrantA() {
        System.out.println(Thread.currentThread().getName()+"执行reentrantA");
        reentrantB();
    }

    private synchronized static void reentrantB() {
        System.out.println(Thread.currentThread().getName()+"执行reentrantB");
    }


}

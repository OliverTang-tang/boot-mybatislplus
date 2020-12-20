package com.example.tangtang.boot.launch.LeetCodeSolution;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample2 {

    private static ReentrantLock reentrantLock=new ReentrantLock(true);
    public static void main(String[] args) {

       new Thread(()->test(),"线程A").start();
        new Thread(()->test(),"线程B").start();
        new Thread(()->test(),"线程C").start();
        new Thread(()->test(),"线程D").start();
        new Thread(()->test(),"线程E").start();
        new Thread(()->test(),"线程F").start();

    }
    public static void test()
    {
        for (int i = 0; i < 2; i++) {
            try {
                reentrantLock.lock();
                //TODO
                System.out.println(Thread.currentThread().getName()+"当前线程获取了锁");
                TimeUnit.SECONDS.sleep(2);

            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(Thread.currentThread().getName()+"当前线程释放了锁");
                reentrantLock.unlock();
            }
        }

    }
}

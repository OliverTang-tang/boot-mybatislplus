package com.example.tangtang.boot.launch.LeetCodeSolution;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {


    public static void main(String[] args) {
        ReentrantLock reentrantLock=new ReentrantLock();
        try {
            reentrantLock.lock();
            //TODO

        }finally {
            reentrantLock.unlock();
        }

    }
}

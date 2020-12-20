package com.example.tangtang.boot.launch.LeetCodeSolution;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExtend {
    public static void main(String[] args) {
        MyThreadPoolExecutor executor=new MyThreadPoolExecutor(2,4,10, TimeUnit.SECONDS,new LinkedBlockingQueue());
        for (int i = 0; i < 3; i++) {
            executor.execute(()->{
                Thread.currentThread().getName();
            });
        }
    }
    static class MyThreadPoolExecutor extends ThreadPoolExecutor{
        private final ThreadLocal<Long> localTime = new ThreadLocal<>();

        public MyThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue) {
            super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
        }
        @Override
        protected void beforeExecute(Thread t, Runnable r) {
            Long sTime = System.nanoTime();// 开始时间 (单位：纳秒)
            localTime.set(sTime);
            System.out.println(String.format("%s | before | time=%s",t.getName(),sTime));
            super.beforeExecute(t,r);
        }
        @Override
        protected void afterExecute(Runnable r,Throwable t)
        {
            Long eTime = System.nanoTime();// 开始时间 (单位：纳秒)
            Long totalTime = eTime - localTime.get(); // 执行总时间
            System.out.println(String.format("%s | after | time=%s | 耗时：%s 毫秒",Thread.currentThread().getName(),eTime,(totalTime/1000000.0)));
            super.afterExecute(r,t);
        }
    }


}


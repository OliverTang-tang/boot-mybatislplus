package com.example.tangtang.boot.launch.LeetCodeSolution;

import java.util.concurrent.*;

public class ThreadExample3 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ThreadPoolExecutor executor=new ThreadPoolExecutor(1, 3, 10, TimeUnit.SECONDS, new LinkedBlockingQueue<>(2), new RejectedExecutionHandler() {
            @Override
            public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
                System.out.println("这是自定义的拒绝策略");
            }
        });
        for (int i = 0; i <15; i++) {
            executor.execute(()->{
                System.out.println(Thread.currentThread().getName());
            });
        }

    }
}

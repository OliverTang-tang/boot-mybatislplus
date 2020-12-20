package com.example.tangtang.boot.launch.LeetCodeSolution;

import com.sun.corba.se.spi.orbutil.threadpool.WorkQueue;

import java.util.concurrent.*;

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Thread thread=new Thread(()->{
            for (int i = 1; i < 6; i++) {
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("子线程睡眠"+i+"秒");
            }
        });
        thread.start();
        thread.join(2000);
        for (int i = 1; i < 4; i++) {
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("主线程睡眠"+i+"秒");
        }
        ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor(2,10,20, TimeUnit.SECONDS,new LinkedBlockingQueue(20));

        //execute
        threadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello,execute");
            }
        });
        //submit
        Future<String> future=threadPoolExecutor.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("Hello,submit");
                return "Submit()方法调用";
            }
        });
        System.out.println(future.get());
    }
}

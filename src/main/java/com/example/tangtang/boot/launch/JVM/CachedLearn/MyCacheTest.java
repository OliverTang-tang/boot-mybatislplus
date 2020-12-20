package com.example.tangtang.boot.launch.JVM.CachedLearn;

import java.util.concurrent.TimeUnit;

public class MyCacheTest {
    public static void main(String[] args) throws InterruptedException {
        CacheUtils cache=new CacheUtils();
        cache.put("name","TangTang",10);
        String name = (String) cache.get("name");
        System.out.println(name);
        String sex = (String) cache.get("Sex");
        System.out.println(sex);
        new ExpireThread().run();
        TimeUnit.SECONDS.sleep(13);
        String name2 = (String) cache.get("name");
        System.out.println(name2);
    }
}

package com.example.tangtang.boot.launch.JVM.CachedLearn;

import java.util.concurrent.ConcurrentHashMap;

public class CacheGlobal {
    //全局缓存对象
    public static ConcurrentHashMap<String,MyCacheEntity> concurrentHashMap=new ConcurrentHashMap<>();
}

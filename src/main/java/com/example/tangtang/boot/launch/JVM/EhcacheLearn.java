package com.example.tangtang.boot.launch.JVM;

import org.ehcache.Cache;
import org.ehcache.CacheManager;
import org.ehcache.config.builders.CacheConfigurationBuilder;
import org.ehcache.config.builders.CacheManagerBuilder;
import org.ehcache.config.builders.ResourcePoolsBuilder;

public class EhcacheLearn {
    public static void main(String[] args) {
        //创建缓存管理器
        CacheManager cacheManager = CacheManagerBuilder.newCacheManagerBuilder().build();
        //初始化 Ehcache
        cacheManager.init();
        //创建缓存（存储器）
        Cache<String, String> tangTangIsLearning = cacheManager.createCache("TangTangIsLearning",
                CacheConfigurationBuilder.newCacheConfigurationBuilder(String.class, String.class, ResourcePoolsBuilder.heap(10)));//设置缓存的最大容量
        //设置缓存
        tangTangIsLearning.put("key","value");
        //读取缓存
        String value = tangTangIsLearning.get("key");
        System.out.println(value);
        //关闭缓存
        cacheManager.close();


    }
}

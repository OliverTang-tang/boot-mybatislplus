package com.example.tangtang.boot.launch.JVM.CachedLearn;

import java.security.Key;
import java.util.concurrent.TimeUnit;

public class ExpireThread implements Runnable {


    @Override
    public void run() {
        int i=0;
        while (i<2)
            try {
                //每10s检查一次
                TimeUnit.SECONDS.sleep(10);
                expireCache();
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                i++;
            }
    }

    /*缓存检测和清除方法*/
    private void expireCache()
    {
        System.out.println("检测缓存是否过期");
        for (String key : CacheGlobal.concurrentHashMap.keySet()) {
            MyCacheEntity cache = CacheGlobal.concurrentHashMap.get(key);
            //当前时间减去写入时间
            long timOutTime= System.currentTimeMillis() - cache.getWriteTime();
            if(cache.getExpireTime()>timOutTime)
            {
                //没有过期
                continue;
            }
            //清除过期缓存
            CacheGlobal.concurrentHashMap.remove(key);
        }

    }
}

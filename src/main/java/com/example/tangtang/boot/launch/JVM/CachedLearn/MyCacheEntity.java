package com.example.tangtang.boot.launch.JVM.CachedLearn;

import lombok.Getter;
import lombok.Setter;

import java.util.Comparator;

@Setter
@Getter
public class MyCacheEntity implements Comparable<MyCacheEntity> {
    private Object key;
    private Object value;
    private long lastTime;
    private long writeTime;
    private long  expireTime;
    private Integer hitCount;


    @Override
    public int compareTo(MyCacheEntity o) {
        return hitCount.compareTo(o.hitCount);
    }
}

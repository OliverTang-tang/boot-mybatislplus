package com.example.tangtang.boot.launch.utils;

import org.assertj.core.util.Lists;
import org.dozer.DozerBeanMapper;
import org.dozer.DozerBeanMapperBuilder;
import org.dozer.Mapper;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class DozerUtils {
    static Mapper mapper = DozerBeanMapperBuilder.buildDefault();

    public static <T> List<T> mapList(Collection sourceList,Class<T> destinationClass){
        List  destinationList = Lists.newArrayList();
        for(Iterator i$ =sourceList.iterator(); i$.hasNext();){
            Object sourceObject = i$.next();
            Object destinationObject= mapper.map(sourceObject,destinationClass);
            destinationList.add(destinationObject);
        }
        return destinationList;
    }
}

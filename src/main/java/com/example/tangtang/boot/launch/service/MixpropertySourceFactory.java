package com.example.tangtang.boot.launch.service;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.DefaultPropertySourceFactory;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.ResourcePropertySource;
import org.springframework.lang.Nullable;

import java.io.IOException;
import java.util.Properties;

public class MixpropertySourceFactory extends DefaultPropertySourceFactory {

    @Override
    public PropertySource<?> createPropertySource(@Nullable String name, EncodedResource resource) throws IOException {
        //return name != null ? new ResourcePropertySource(name, resource) : new ResourcePropertySource(resource);

        String sourceName= name !=null ? name:resource.getResource().getFilename();
        if(sourceName !=null && (sourceName.endsWith(".yml")||sourceName.endsWith("yaml")))
        {
            Properties propertiesFromYaml=loadYml(resource);
            return new PropertiesPropertySource(sourceName,propertiesFromYaml);

        }else {
            return super.createPropertySource(name,resource);
        }
    }

    private Properties loadYml(EncodedResource resource) throws IOException{
        YamlPropertiesFactoryBean factory = new YamlPropertiesFactoryBean();
        factory.setResources((resource.getResource()));
        factory.afterPropertiesSet();
        return factory.getObject();
    }

}

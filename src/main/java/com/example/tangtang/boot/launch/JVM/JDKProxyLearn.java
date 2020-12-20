package com.example.tangtang.boot.launch.JVM;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxyLearn {
    static interface Car{
        void running();
    }
    static class Bus implements Car{

        @Override
        public void running() {
            System.out.println("The Bus is running");
        }
    }

    static class Taxi implements Car{

        @Override
        public void running() {
            System.out.println("The Taxi is running");
        }
    }

    //使用JDK Proxy
    static class JDKProxy implements InvocationHandler{
        private Object target;

        public Object getInstance(Object target){
            this.target=target;
            return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
            //target.getClass().getClassLoader() 代理类的类加载器
            //target.getClass().getInterfaces()被代理类的接口，如果有多个就是数组形式传入。
            // 代理类实例
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("动态代理之前的业务处理");
            Object result=method.invoke(target,args);//利用反射调用类里面的实际方法
            return result;//方法的返回值，没有就是null
        }
    }

    public static void main(String[] args) {
        JDKProxy jdkProxy=new JDKProxy();
        Car carInstance =(Car) jdkProxy.getInstance(new Taxi());
        carInstance.running();

    }
}

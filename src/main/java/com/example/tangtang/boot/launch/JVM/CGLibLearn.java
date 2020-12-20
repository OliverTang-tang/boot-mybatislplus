package com.example.tangtang.boot.launch.JVM;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLibLearn {
    static class Car{
        public void running()
        {
            System.out.println("The car is running");
        }
    }
    /*CGLib 代理类*/
    static class CGLibProxy  implements MethodInterceptor{
        private Object target;

        public Object getInstance(Object target)
        {
            this.target=target;

            Enhancer enhancer=new Enhancer();
            enhancer.setSuperclass(this.target.getClass());
            enhancer.setCallback(this);
            return enhancer.create();
        }

        @Override
        public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
            System.out.println("CGlib---方法调用前调用方法");
            Object result = methodProxy.invokeSuper(o, objects);
            return result;
        }
    }

    public static void main(String[] args) {
        CGLibProxy proxy=new CGLibProxy();
        Car car = (Car) proxy.getInstance(new Car());
        car.running();
    }
}

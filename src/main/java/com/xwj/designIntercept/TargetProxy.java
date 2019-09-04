package com.xwj.designIntercept;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2018/11/29 10:10
 * @Version 1.0
 **/
public class TargetProxy implements InvocationHandler {
    private Object target;
    public TargetProxy(Object target){
        this.target=target;
    }
    public static Object bind(Object target){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new TargetProxy(target));
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.err.println("begin");
        return method.invoke(target,args);
    }
}

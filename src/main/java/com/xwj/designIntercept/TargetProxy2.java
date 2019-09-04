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
public class TargetProxy2 implements InvocationHandler {
    private Object target;
    private Interceptor interceptor;
    public TargetProxy2(Object target,Interceptor interceptor){
        this.target=target;
        this.interceptor=interceptor;
    }
    public static Object bind(Object target,Interceptor interceptor){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new TargetProxy2(target,interceptor));
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return interceptor.intercept(new Invocation(target,method,args));
    }
}

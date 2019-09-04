package com.xwj.designIntercept;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2018/11/29 14:37
 * @Version 1.0
 **/
public class TargetProxyTest {
    public static void main(String[] args) {
//        Target target=new TargetImp();
//        target= (Target) TargetProxy.bind(target);
//        target.execute();
        Interceptor interceptor=new InterceptorImp();
        Target target=new TargetImp();
        target= (Target) interceptor.register(target);
        target.execute();
    }
}

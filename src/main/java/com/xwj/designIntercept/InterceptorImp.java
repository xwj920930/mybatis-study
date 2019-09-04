package com.xwj.designIntercept;

import java.lang.reflect.InvocationTargetException;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2018/11/29 15:19
 * @Version 1.0
 **/
@MethodName("execute1")
public class InterceptorImp implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws InvocationTargetException, IllegalAccessException {
        System.err.println("go");
        return invocation.proceed();
    }

    @Override
    public Object register(Object target) {
        return TargetProxy2.bind(target, this);
    }
}

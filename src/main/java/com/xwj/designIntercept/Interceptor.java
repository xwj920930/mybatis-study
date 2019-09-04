package com.xwj.designIntercept;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public interface Interceptor {
    //用于封装前置通知
    public Object intercept(Invocation invocation) throws InvocationTargetException, IllegalAccessException;
    public Object register(Object target);
}

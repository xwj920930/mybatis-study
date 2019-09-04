package com.xwj.designIntercept;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Description 将代理类的invoke放进来
 * @Author yuki
 * @Date 2018/11/29 14:54
 * @Version 1.0
 **/
public class Invocation {
    private Object target;
    private Method method;
    private Object[] args;
    public Invocation(Object target, Method method, Object[] args) {
        this.target = target;
        this.method = method;
        this.args = args;
    }
    public Object proceed() throws InvocationTargetException, IllegalAccessException {
        return method.invoke(target,args);
    }
}

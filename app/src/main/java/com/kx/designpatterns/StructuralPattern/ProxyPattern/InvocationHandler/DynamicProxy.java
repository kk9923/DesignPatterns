package com.kx.designpatterns.StructuralPattern.ProxyPattern.InvocationHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *  动态代理类  ---  持有 被代理类的引用
 */
public class DynamicProxy implements InvocationHandler {
    // 被代理类的引用
    private Object mObject;

    public DynamicProxy(Object object) {
        mObject = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 调用被代理类 对象的方法
        Object invoke = method.invoke(mObject, args);
        return invoke;
    }
}

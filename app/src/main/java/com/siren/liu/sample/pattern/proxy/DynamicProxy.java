package com.siren.liu.sample.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {
    private Object original;

    public Object bind(Object original) {
        this.original = original;
        return Proxy.newProxyInstance(original.getClass().getClassLoader(), original.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(original, args);
    }
}

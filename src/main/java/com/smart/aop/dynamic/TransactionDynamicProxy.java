package com.smart.aop.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author Emilia
 * @Since 2020.11.02 14:44
 * <p>
 * 事务代理类
 */
public class TransactionDynamicProxy implements InvocationHandler {
    /**
     * 被代理对象
     */
    private Object target;

    public Object newInstance(Object object) {
        this.target = object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),
                object.getClass().getInterfaces(), this);
    }

    /**
     * @param proxy  代理对象
     * @param method 对象中的核心方法
     * @param args   方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("");
        return null;
    }
}

package com.smart.aop.serive.proxy;

import com.smart.aop.serive.UserService;

/**
 * @Author Emilia
 * @Since 2020.11.02 14:28
 *
 *  静态代理
 *  代理对象必须持有被代理对象的引用
 *
 *  一个代理类只能代理一个接口
 */
public class UserServiceProxy implements UserService {
    @Override
    public String login() {
        return null;
    }

    @Override
    public String register() {
        return null;
    }
}

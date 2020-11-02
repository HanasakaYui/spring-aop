package com.smart.aop.serive.impl;

import com.smart.aop.serive.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author Emilia
 * @Since 2020.11.02 14:24
 *
 * 被代理对象
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public String login() {
        return null;
    }

    @Override
    public String register() {
        System.out.println("核心方法");
        return null;
    }
}

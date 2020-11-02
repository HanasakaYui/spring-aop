package com.smart.aop;

import com.smart.aop.serive.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Emilia
 * @Since 2020.11.02 18:52
 */
public class TestMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.register();
    }
}

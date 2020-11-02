package com.smart.aop.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author Emilia
 * @Since 2020.11.02 16:09
 *
 * 定义切面（定义代理类）
 */
@Component
@Aspect
public class TestAdvice {
    /**
     * 切入点
     *  Pointcut 定义切入点
     *     参数：value -- 表示切入点表达式(execution())或者注解(@annotation())
     *
     * 格式 ：
     *  方法的可见性，可以用 “*” 表示任意修饰符
     *  返回类型，也可以用 “*” 表示任意返回类型
     *  类路径
     *  .. 表示匹配任意参数
     *
     *  操作符
     *    &&  ||  !
     */
    @Pointcut(value = "execution" +
            "(public * com.smart.aop.serive.UserService.register(..))")
    public void point(){

    }

    /**
     * 定义通知
     *  前置通知：Before
     *  返回通知：After-returning
     *  异常通知：After-throwing
     *  环绕通知：Around
     *  最终通知：After
     *
     *  可以重新定义切入点，也可以引用定义好的切入点
     */
    @Before(value = "point()")
    public void before(){
        System.out.println("前置通知");
    }

    @AfterReturning(value = "point()")
    public void afterReturning(){
        System.out.println("不带参数的返回通知");
    }
    @AfterReturning(value = "point()",returning="username")
    public String afterReturning(String username){
        System.out.println("带参数的返回通知");
        return username;
    }

    @AfterThrowing(value = "point()",throwing = "e")
    public void afterThrowing(Exception e){
        System.out.println(e.getMessage());
    }

    @Around(value = "point()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        //method.invoke();
        System.out.println("环绕前");
        Object proceed = pjp.proceed();
        System.out.println("环绕后");
        return proceed;
    }

    @After("point()")
    public void after(){
        System.out.println("最终通知");
    }
}

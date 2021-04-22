package com.spring.springrest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserServiceAspect {

    @Before("execution(* com.spring.springrest.services.UserService.addUserDetails(..))")
    public void addUserBefore(JoinPoint joinpoint) {
        System.out.println("Execution started");
        System.out.println(joinpoint.getSignature().getDeclaringType());
    }
    @After("execution(* com.spring.springrest.services.UserService.addUserDetails(..))")
    public void addUserAfter(JoinPoint joinpoint) {
        System.out.println("Execution completed");
        System.out.println(joinpoint.getSignature().getDeclaringType());
    }
    @Before("execution(* com.spring.springrest.services.UserService.getUserDetails(..))")
    public void getUserBefore(JoinPoint joinpoint) {
        System.out.println("Execution started");
        System.out.println(joinpoint.getSignature().getDeclaringType());
    }
    @After("execution(* com.spring.springrest.services.UserService.addUserDetails(..))")
    public void getUserAfter(JoinPoint joinpoint) {
        System.out.println("Execution completed");
        System.out.println(joinpoint.getSignature().getDeclaringType());
    }



}

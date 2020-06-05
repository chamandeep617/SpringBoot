package com.example.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class MyAspect {

    @Before("execution(* com.example.aop.Alien.*(..))")
    public void logBefore(){
        System.out.println("Hello");
    }

    @After("execution(* com.example.aop.Alien.*(..))")
    public void logAfter(){
        System.out.println("Bye");
    }
//    @AfterReturning(pointcut = "execution(public void show())")
//    public void logAfter(JoinPoint joinpoint){
//        System.out.println("hey "+ joinpoint.getSignature().getName());
//    }

}

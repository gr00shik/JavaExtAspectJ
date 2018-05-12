package com.gr00shik.asp;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {

    @Around("print()")
    public void firstPrint(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("before "+pjp.getSignature().getName()+" method");
        pjp.proceed();
        System.out.println("after "+pjp.getSignature().getName()+" method");
    }

    @Around("annotCl()")
    public Object secondAnnot(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("before "+pjp.getSignature().getName()+" method");
        Object obj = pjp.proceed();
        System.out.println("after "+pjp.getSignature().getName()+" method");
        return (String)obj;
    }

    @Before("retString()")
    public void thirdReturn(){
        System.out.println("Before method");
    }

    @Pointcut("execution(* *..*.myPrint*(..))")
    public void print(){}

    @Pointcut("execution(* @com.gr00shik.util.InvAspect *..*.myAnnot*(..))")
    public void annotCl(){}

    @Pointcut("execution(String *())")
    public void retString(){}

}

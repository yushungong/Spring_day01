package com.net.gong.aop.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyBook {
	//前置通知
	@Before(value="execution(* com.net.gong.aop.annotation.Book.book(..))")
	public void before1() {
		System.out.println("before1....annotation..........");
	}
	//环绕通知
	@Around(value="execution(* com.net.gong.aop.annotation.Book.book(..))")
	public void around1(ProceedingJoinPoint proceedingJoinPoint) {
		//方法之前逻辑
		System.out.println("annotation之前逻辑。。。。");
		
		//切面
		try {
			proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		//方法之后逻辑
		System.out.println("annotation之后逻辑。。。。");
	}
}

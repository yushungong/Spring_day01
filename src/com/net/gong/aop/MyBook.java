package com.net.gong.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyBook {
	//前置通知
	public void before1() {
		System.out.println("before1..............");
	}
	//环绕通知
	public void around1(ProceedingJoinPoint proceedingJoinPoint) {
		//方法之前逻辑
		System.out.println("之前逻辑。。。。");
		
		//切面
		try {
			proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		//方法之后逻辑
		System.out.println("之后逻辑。。。。");
	}
}

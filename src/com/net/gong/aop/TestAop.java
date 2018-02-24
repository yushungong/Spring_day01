package com.net.gong.aop;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
	
	private static Logger log = Logger.getLogger(TestAop.class);
	
	public static void main(String[] args) {
		// 1、加载spring配置文件，根据创建对象***************************
		ApplicationContext conteztApplicationContext = new ClassPathXmlApplicationContext("Config/SpringAop.xml");
		// <!-- 使用类的无参构造器创建类的对象 -->
		Book book = (Book) conteztApplicationContext.getBean("book");
		book.book(1);
		log.warn("测试日志功能");
		
	}

} 

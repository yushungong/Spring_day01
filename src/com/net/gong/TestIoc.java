package com.net.gong;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.net.gong.aop.TestAop;

public class TestIoc {
	
	private static Logger log = Logger.getLogger(TestIoc.class);
	
	@SuppressWarnings("resource")
	@Test
	public void TestUser(){
		// 1、加载spring配置文件，根据创建对象***************************
		ApplicationContext conteztApplicationContext = new ClassPathXmlApplicationContext("Config/ApplicationContext.xml");
		//<!-- 使用类的无参构造器创建类的对象 -->
		User user = (User) conteztApplicationContext.getBean("user");
		log.warn("日志测试");
		user.add();
		
		//<!-- 使用静态工厂创建类的对象 -->
		User user2 = (User) conteztApplicationContext.getBean("user2");
		user2.add();
		
		//<!-- 使用实例工厂创建类的对象 -->
		User user3 = (User) conteztApplicationContext.getBean("user2");
		user3.add();
	}
}

package com.net.gong.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceDemo {
	
	private DaoDemo daoDemo;

	public void service() {
		daoDemo.dao();
		System.out.println("service........");
	}
	
	public DaoDemo getDaoDemo() {
		return daoDemo;
	}

	public void setDaoDemo(DaoDemo daoDemo) {
		this.daoDemo = daoDemo;
	}

	public static void main(String[] args) {
		// 1、加载spring配置文件，根据创建对象***************************
		ApplicationContext conteztApplicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		// 使用有参构造器注入属性
		ServiceDemo service = (ServiceDemo) conteztApplicationContext.getBean("service");
		service.service();
	}
	
}

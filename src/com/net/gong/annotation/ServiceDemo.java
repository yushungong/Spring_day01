package com.net.gong.annotation;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.net.gong.aop.Book;

@Service
//以注解方式创建service对象
//也可写成@Repository("service")
public class ServiceDemo {
	//得到dao对象
	//1 定义dao类型属性
	//在dao属性上面使用注解完成对象注入
	//@Autowired
	//private DaoDemo dao;
	//使用注解方式时候不需要set方法
	
	//另一种注入对象属性的注解
	//name属性中设置要注入的对象的value值
	@Autowired
	private DaoDemo daoDemo;

	public void service() {
		daoDemo.dao();
		System.out.println("service........");
	}
	
	public static void main(String[] args) {
		ApplicationContext conteztApplicationContext = new ClassPathXmlApplicationContext("Config/SpringAnnotation.xml");
		ServiceDemo serviceDemo = (ServiceDemo) conteztApplicationContext.getBean("serviceDemo");
		serviceDemo.service();
	}
}

package com.net.gong.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertyDemo {
	
	private String name;
	
	public PropertyDemo() {}
	
	public PropertyDemo(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void test(){
		System.out.println("property.................."+name);
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 1、加载spring配置文件，根据创建对象***************************
		ApplicationContext conteztApplicationContext = new ClassPathXmlApplicationContext("Config/ApplicationContext.xml");
		//使用有参构造器注入属性
		/*PropertyDemo property1 = (PropertyDemo) conteztApplicationContext.getBean("property1");
		property1.test();*/
		// 使用set方法设置属性
		PropertyDemo property2 = (PropertyDemo) conteztApplicationContext.getBean("property2");
		property2.test();
	}

}

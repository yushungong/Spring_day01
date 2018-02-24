package com.net.gong.annotation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class SpringWeb extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//Filter和Servlet无法使用自动注入属性。（因为这两个归tomcat容器管理）可以用init(集承自HttpServlet后重写init方法)方法中实例化对象
	//@Autowired
	private ServiceDemo serviceDemo;
	
	@Override
	public void init() throws ServletException {
		System.out.println("init...");
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
		serviceDemo = (ServiceDemo) context.getBean("serviceDemo");
	}
	
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doget...");
		serviceDemo.service();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

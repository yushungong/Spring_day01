package com.net.gong.annotation;

import org.springframework.stereotype.Repository;

@Repository
//以注解方式创建dao对象
//也可写成@Repository("dao")
public class DaoDemo {
	
	public void dao() {
		System.out.println("dao..........");
	}
}

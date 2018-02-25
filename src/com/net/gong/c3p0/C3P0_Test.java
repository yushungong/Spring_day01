package com.net.gong.c3p0;

import java.sql.Connection;

import org.springframework.transaction.annotation.Transactional;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Transactional
// 该注解开启事务，加上注解的所有方法都会开启事务
public class C3P0_Test {
	public static void main(String[] args) {
		try {
			test1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//c3p0连接池手动配置方法
	private static void test1() throws Exception{
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass("com.microsoft.sqlserver.jdbc.SQLServerDriverr");
		dataSource.setJdbcUrl("jdbc:sqlserver://127.0.0.1:1433;DatabaseName=MYDB_HOME");
		dataSource.setUser("sa");
		dataSource.setPassword("Password_1462");
		Connection con =  dataSource.getConnection();
		con.prepareStatement("INSERT INTO [emp] ([eid], [ename], [esal], [esex]) VALUES ('1', 'aa', '3000', '男');");
	}
}

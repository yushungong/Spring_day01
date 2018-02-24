package com.net.gong.c3p0;

import java.sql.Connection;

import org.springframework.transaction.annotation.Transactional;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Transactional
// 该注解开启事务，加上注解的所有方法都会开启事务
public class C3P0_Test {
	public static void main(String[] args) {
		
	}
	
	//c3p0连接池手动配置方法
	@SuppressWarnings("unused")
	private static void test1() throws Exception{
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		dataSource.setJdbcUrl("sqlserver://db.rnd.cas-pe.com:1433;databaseName=CAS_PRD_PAS_DATA_SC");
		dataSource.setUser("sa");
		dataSource.setPassword("123456");
		Connection con =  dataSource.getConnection();
		con.prepareStatement("sql");
	}
}

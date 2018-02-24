package com.net.gong.jdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class TestCRUD {
	//spring JdbcTemplate 数据库添加操作（修改和删除同理，不做演示）
	public void add(){
		//设置数据库信息
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("");
		dataSource.setUrl("");
		dataSource.setUsername("");
		dataSource.setPassword("");
		
		//创建jdbcTemplate对象，设置数据源
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		//调用jdbcTemplate对象里面的方法实现操作
		//创建sql语句
		String sql = "insert into user values(?,?)";
		int rows = jdbcTemplate.update(sql,"lucy","25");
		System.out.println("被改变行数："+rows);
	}
	
	//spring JdbcTemplate 数据库查询操作
	public void select(){
		// 设置数据库信息
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("");
		dataSource.setUrl("");
		dataSource.setUsername("");
		dataSource.setPassword("");

		// 创建jdbcTemplate对象，设置数据源
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		// 调用jdbcTemplate对象里面的方法实现操作
		// 创建sql语句
		String sql = "select count(*) from user";
		//调用jdbcTemplate方法
		//第二个参数为返回值类型
		int count = jdbcTemplate.queryForObject(sql, Integer.class);
		System.out.println(count);
	}
}

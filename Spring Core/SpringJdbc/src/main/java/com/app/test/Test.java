package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.app.config.AppConfig;

/**
 *  JDBCTemplate Depends on DataSource which is Interface and Impl class is DriverManagerDataSource .
 * 
 * 	JDBCTemplate does not require any model class . we have to define table in database ourselves
 * 
 * **/


public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac = new  AnnotationConfigApplicationContext(AppConfig.class);
		
		// getting jdbcTemplate Object
		JdbcTemplate jt =  ac.getBean("jtobj", JdbcTemplate.class);
		
		String sql = "insert into employee values(?,?,?,?,?)";
		
		int count = jt.update(sql,1005,"ghj",24,"Male","In");

//		String sql = "delete from employee where id=?";
//		int count = jt.update(sql,1005);

//		String sql = "update employee set name=?,age=?,gen=?,address=? where id=?";
//		int count = jt.update(sql,"ghj",24,"Male","In",1003);
		
		
	
		
		System.out.println(count);
	}

}

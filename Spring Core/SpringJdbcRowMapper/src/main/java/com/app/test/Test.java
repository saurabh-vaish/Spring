package com.app.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.app.config.AppConfig;
import com.app.mapper.MyRowMapper;
import com.app.model.Employee;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		JdbcTemplate jt = ac.getBean("jtobj",JdbcTemplate.class);
		MyRowMapper mr = new MyRowMapper();
		
//		for fetching one row
//		String sql = "select * from employee where id =?";
//		Employee e = jt.queryForObject(sql,mr,1003);
//		System.out.println(e);
		
		// for fetching all rows from table 
		
		String sql = "select * from employee";
		List<Employee> list = jt.query(sql,mr);
		list.forEach(System.out::println); //jdk 1.8 feature 
	}
	
}

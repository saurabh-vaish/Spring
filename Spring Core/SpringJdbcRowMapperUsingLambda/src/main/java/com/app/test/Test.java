package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.app.config.AppConfig;
import com.app.model.Employee;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		JdbcTemplate jt = ac.getBean("jtobj", JdbcTemplate.class);
		
		String sql = "select * from employee";
		
		//using lambda expression no need to write implementation class on RowMapper bcs it is a functional inteface
		// so we can write lambda expression , and here we are using parameterised const. of Employee class 
		// so need to write setter and getter
		
		jt.query(sql,(rs,row)->new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5))).forEach(System.out::println);
	}
}

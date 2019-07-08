package com.app.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.app.config.AppConfig;
import com.app.mapper.MyRowMapper;
import com.app.model.Employee;


/**
 *  RowMapper(I)  --> This interface is used to map resultset rows into model class object.  It is having one method mapRow() .
 * 
 * 						<model class object> mapRow(ResultSet , rowNum) 	 
 * 
 * 			Since there is only one method so we can use lambda expression also , then no  need to write row mapper impl class
 * 
 * 
 * **/


public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac = new  AnnotationConfigApplicationContext(AppConfig.class);
		
		// getting jdbcTemplate Object
		JdbcTemplate jt =  ac.getBean("jtobj", JdbcTemplate.class);
		
		MyRowMapper mr = new MyRowMapper();
	
		String sql = "select * from employee";

		List<Employee> list = jt.query(sql,mr);   // for fetching all rows takes query and rowmapper 

		list.forEach(System.out::println); //jdk 1.8 feature 

		
		//using lambda expression no need to write implementation class on RowMapper bcs it is a functional inteface
		// so we can write lambda expression , and here we are using parameterised const. of Employee class 
		// so need to write setter and getter
				
		jt.query(sql,
					(rs,row)-> new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5))
				)
		.forEach(System.out::println);
		
		
		/*
		for fetching one row
		String sql = "select * from employee where id =?";
		Employee e = jt.queryForObject(sql,mr,1003);
		System.out.println(e);
		
		 for fetching all rows from table 
		
		*/
	
	}
	
}

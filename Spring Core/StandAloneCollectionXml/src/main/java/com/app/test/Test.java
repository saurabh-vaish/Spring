package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.model.Employee;

public class Test {

	public static void main(String[] args) {
		
		// loading configuration file 
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/app/config/config.xml");
	
		// getting Employee object 
		Employee e = ac.getBean("employee",Employee.class);
		
		System.out.println(e);
	}
	
	
}

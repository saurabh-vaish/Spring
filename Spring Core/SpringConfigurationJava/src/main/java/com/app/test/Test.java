package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.AppConfig;
import com.app.model.Employee;

public class Test {

	public static void main(String[] args) {
		
		// loading configuration file 
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
	
		// getting Employee object 
		Employee e = ac.getBean("emp",Employee.class);
		
		System.out.println(e);
	}
	
	
}

package com.app.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.app.config.AppConfig;
import com.app.model.Employee;

public class Test  {

	public static void main(String[] args) {
		
		AbstractApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee e = ac.getBean("empObj",Employee.class);
		System.out.println(e);
		
		ac.registerShutdownHook();
		
	}

}

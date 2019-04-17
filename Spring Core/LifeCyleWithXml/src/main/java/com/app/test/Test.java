package com.app.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.model.Employee;

public class Test  {

	public static void main(String[] args) {
		
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("com/app/config/config.xml");
		Employee e = ac.getBean("employee",Employee.class);
		System.out.println(e);
		
		ac.registerShutdownHook();
		
	}

}

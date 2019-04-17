package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.model.Student;

public class Test {

	public static void main(String[] args) {
		
	
	ApplicationContext ac = new ClassPathXmlApplicationContext("com/app/config/config.xml");

	Student s = ac.getBean("student",com.app.model.Student.class);
	
	System.out.println(s);
	
	
	}
}

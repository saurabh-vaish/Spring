package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.AppConfig;
import com.app.model.Student;

public class Test {

	public static void main(String[] args) {
		
	
	ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

	Student s = ac.getBean("sob",com.app.model.Student.class);
	
	System.out.println(s);
	
	
	}
}

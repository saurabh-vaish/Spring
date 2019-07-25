package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.component.MyService;
import com.app.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		MyService ms = ac.getBean("myService",MyService.class);
		
		
		// If this method will match with any pointcut expression then their advice execute
		ms.getData();
		
		ms.buisnessMethod();
	}
	
	
}

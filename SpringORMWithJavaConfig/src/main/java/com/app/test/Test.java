package com.app.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.AppConfig;
import com.app.model.User;
import com.app.service.IUserService;

/**
 * ORM--->	Object Relational Mapping maps  class with table and variable with columns . It makes one row with object and object to rows.
 * 
 *    		ORM can be done using hibernate template .
 *    		
 *    Hibernate Template(C) ---> Session Factory(I) ---> LocalSessionfactoryBean(C) ---> DataSource(I) --->BasicDataSource or DriverManagerDataSource(C)
 * 
 * 		
 * 		Test --> UserServiceImpl ---> IUserService -->UserDaoImpl --->IUserDao -->HibernateTemplate
 * 
 * ***/

public class Test {

	
	
	public static void main(String[] args) {
	
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		IUserService service = ac.getBean("userServiceImpl",IUserService.class);  // object taken of implementation class 
		
		User u = new User(12,"AA","A@A.com");
		
		Integer i =  service.saveUser(u);  System.out.println(i);
		
		 User user = service.getUserById(11);  System.out.println(user);
		 
		 service.getAllUsers().forEach(System.out::println);
		
	}
	
	
}

package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.AppConfig;
import com.app.model.Employee;

/***
 *  Spring Bean Scope -->  Spring bean scope have 4 types -- Singleton , Prototype ,Request ,Session    .  Global (previous not now)
 *  					
 *  	Singleton -->  Only one object is created  and maintained until the container is terminated. It is default scope
 *  	Prototype -->  Every time new object is created  when programmer accessed .
 *  	Request ---> Used in web programming . When client make request then it is generated and remain until response is given.
 *  	Session --> this scope is created when user logged in . and destroyed when he logged off.
 *  
 *       --> Two scopes for normal spring bean -- Singleton , Prototype
 *  	
 * 		To define scope --->
 * 			XML --> use scope attribute in bean tag  . <bean .... scope="prototype"  >
 * 
 * 			Java Configuration --->  @Bean  + @Scope(".."
 * 
 * 			Annotation   --> @Scope("prototype") +  @Component  Use annotation on bean classes .
 *        
 *
 * 	**** No need to define for Singleton as it is default scope ..
 * 
 * 
 * ***/



public class Test {

	public static void main(String[] args) {
		
		// loading configuration file 
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
	
		// getting Employee object 
		Employee e1 = ac.getBean("emp",Employee.class);
		
		Employee e2 = ac.getBean("emp",Employee.class);
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	
		System.out.println("e1==e2" + (e1==e2));
	}
	
	
}

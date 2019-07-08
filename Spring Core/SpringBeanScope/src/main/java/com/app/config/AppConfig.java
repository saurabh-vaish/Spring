package com.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;

import com.app.model.Employee;

@Configuration							// for configuration
@PropertySource("app.properties")		// for loading properties file
public class AppConfig {

	@Autowired
	private Environment env;     
	
	@Bean 							
	@Scope("prototype") 			//  for prototype scope using java configuration
	public Employee emp()
	{
		Employee e = new Employee();
		e.setEmpId(Integer.parseInt(env.getProperty("id")));   
		e.setEmpName(env.getProperty("name"));
		return e;
	}
	
}

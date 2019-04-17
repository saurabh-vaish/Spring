package com.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.app.model.Employee;

@Configuration
@PropertySource("classpath:app.properties")
public class AppConfig {

	@Autowired
	private Environment env;
	
	@Bean 
	public Employee empObj()
	{
		Employee emp = new Employee();
		emp.setEmpId(Integer.parseInt(env.getProperty("id")));
		emp.setEmpName(env.getProperty("name"));
		return emp;
	}
	
	
}

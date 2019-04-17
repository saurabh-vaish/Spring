package com.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.app.model.Employee;

@Configuration
@ComponentScan("com.app")
@PropertySource("classpath:app.properties")
public class AppConfig {

	@Autowired
	private Environment env;
	
}

package com.app.config;

import javax.activation.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.app")
@Import(SecurityConfig.class)    // importing security configuration class 
public class AppConfig {

	// to encode passwords 
	@Bean
	public BCryptPasswordEncoder encoder()
	{
		return new BCryptPasswordEncoder();
	}
	
	
	// datasource 
	
	
	  @Bean 
	  public BasicDataSource ds() 
	  {
		  BasicDataSource ds = new  BasicDataSource(); 
		  ds.setDriverClassName("com.mysql.jdbc.Driver");
		  ds.setUrl("jdbc:mysql://localhost:3306/test"); 
		  ds.setUsername("root");
		  ds.setPassword("root"); 
		  return ds; 
	}
	 
	
	@Bean
	public InternalResourceViewResolver ivr()
	{
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/views/");
		vr.setSuffix(".jsp");
		return vr;
	}
}

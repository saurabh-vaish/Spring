package com.app.config;
  // importing security configuration class

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.app")
@EnableWebMvc
@Import(SecurityConfig.class)   // importing security configuration class
public class AppConfig {
	
	@Bean
	public BCryptPasswordEncoder encoder()   	// for password encoding
	{
		return new BCryptPasswordEncoder();
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

package com.app.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
@ComponentScan("com.app")
public class AppConfig {

	
	// JavaMailSender(I) to send mail since interface so implimentation class
	@Bean
	public JavaMailSenderImpl mailSender()
	{
		JavaMailSenderImpl m = new JavaMailSenderImpl();
		m.setHost("smtp.gmail.com");
		m.setPort(587);
		m.setUsername("saurabh.vaish1993@gmail.com");
		m.setPassword("********");
		m.setJavaMailProperties(props());
		return m;
	}
	
	public Properties props()
	{
		Properties p = new Properties();
		p.put("mail.smtp.auth", "true");
		p.put("mail.smtp.starttls.enable", "true");
		return p;
	}
	
}

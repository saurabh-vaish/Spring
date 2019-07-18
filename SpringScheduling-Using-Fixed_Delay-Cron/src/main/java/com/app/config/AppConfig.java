package com.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;


@Configuration
@ComponentScan("com.app")
@EnableScheduling				// to enable scheduling in spring
public class AppConfig {
	
}

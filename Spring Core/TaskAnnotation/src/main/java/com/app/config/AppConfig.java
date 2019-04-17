package com.app.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.app.model.Course;
import com.app.model.Student;

@Configuration
@ComponentScan("com.app")
@PropertySource("classpath:app.properties")
public class AppConfig {
	
	@Autowired
	private Environment env;

	// for Cname 
	@Bean
	public List<String> clist()
	{
		List<String> l =new ArrayList<String>();
		l.add("java");
		l.add("c");
		l.add("c++");
		return l;
	}
	
	// for Ccost  property 
	@Bean
	public Properties cProp()
	{
		Properties p = new Properties();  // for properties
		p.put("java", 4200);
		p.put("c", 2000);
		p.put("c++", 3000);
		
		return p;
	}
	
	
	// for stdCourse
	@Bean
	public Set<String> sCourse()
	{
		Set<String> s = new HashSet<String>();
		s.add("Java");
		return s;
	}
	
	//for address
	@Bean
	public Map<Integer,String> sAdd()
	{
		Map<Integer,String> m = new HashMap<Integer,String>();
		m.put(1, "hyd");
		m.put(2, "syd");
		return m;
	}
	
	
}

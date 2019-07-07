package com.app.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages="com.app")
@PropertySource("app.properties")
public class AppConfig {
	
	@Autowired
	private Environment env;
	
	
	/**** for stand alone collections *****/
	
	
	// for list
	@Bean
	public List<String> prj(){
		List<String> list = new ArrayList<>();
		list.add(env.getProperty("p1"));
		list.add(env.getProperty("p2"));
		list.add(env.getProperty("p3"));
		return list;
	}

	
	// for set
	@Bean
	public Set<Long> phn(){
		Set<Long> set = new  HashSet<>();
		set.add(Long.parseLong(env.getProperty("c1")));
		set.add(Long.parseLong(env.getProperty("c2")));
		return set;
	}
	

	// for map
	@Bean
	public Map<Integer,String> addr(){
		Map<Integer,String> map = new HashMap<>();
		map.put(1,env.getProperty("a1"));
		map.put(2,env.getProperty("a2"));		
		return map;
	}
	
}

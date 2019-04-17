package com.app.test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class EmployeeTestConsumer {

	public static void main(String[] args) {
		
		//1. url 
		String url = "http://localhost:8081/SpringRestProvider/get";
		
		//2.  create RestTemplate obj
		RestTemplate rt = new RestTemplate();
	
	//4. getting ResponseEntity object	3. getting response by making http method call . 
		ResponseEntity<String> rs = rt.getForEntity(url, String.class);
		
		// calling methods for o/p
		
		System.out.println(rs.getBody());  // body
		System.out.println(rs.getStatusCode().name());  // status code
		System.out.println(rs.getStatusCodeValue());  // status 
		
	} 

	
}

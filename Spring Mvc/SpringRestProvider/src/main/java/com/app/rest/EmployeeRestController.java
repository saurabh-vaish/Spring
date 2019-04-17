package com.app.rest;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRestController {

	// for getting data 
	@GetMapping("/get")
	public ResponseEntity<String> forGet()  // for getting response .The return type must be ResponseEntity<className>
	{
		// generating response having body and httpStatus  
		ResponseEntity<String> res = new ResponseEntity<String>("hello from get  ",HttpStatus.OK); 
		
		return res;
		
	}
	
	
	@PostMapping("/post")
	public ResponseEntity<String> forPost()  // for getting response .The return type must be ResponseEntity<className>
	{
		// generating response having body and httpStatus  
		ResponseEntity<String> res = new ResponseEntity<String>("hello from post  ",HttpStatus.OK); 
		
		return res;
		
	}
	
	@PutMapping("/put")
	public ResponseEntity<String> forPut()  // for getting response .The return type must be ResponseEntity<className>
	{
		// generating response having body and httpStatus  
		ResponseEntity<String> res = new ResponseEntity<String>("hello from put  ",HttpStatus.OK); 
		
		return res;
		
	}
	
	@DeleteMapping("/post")
	public ResponseEntity<String> forDelete()  // for getting response .The return type must be ResponseEntity<className>
	{
		// generating response having body and httpStatus  
		ResponseEntity<String> res = new ResponseEntity<String>("hello from delete  ",HttpStatus.OK); 
		
		return res;
		
	}
	
	
}
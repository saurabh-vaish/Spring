package com.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;

@RestController  // with this @ResponseBody will automatically comes inside it as @RestController = @Controller + @ResponseBody
@RequestMapping("/student")
public class StudentRestController {
	
	@PostMapping("/datain")
	public ResponseEntity<String> readData(@RequestBody Student student)
	{
		ResponseEntity<String> res = new ResponseEntity<String>("data is "+student,HttpStatus.OK);
		return res;
	}
	
	
	@GetMapping("/dataout")
	public ResponseEntity<Student> writeData()
	{
		Student s = new Student(10,"AA",4.4);
		ResponseEntity<Student> res = new ResponseEntity<Student>(s,HttpStatus.OK);
		return res;
	}
	
	
	@GetMapping("/dataall")
	public ResponseEntity<List<Student>> writeAll()
	{
		return new ResponseEntity<List<Student>>(
				Arrays.asList(
				new Student(11,"ab",3.4),
				new Student(12,"bc",5.5)
				),HttpStatus.OK);
	}
	
	
}

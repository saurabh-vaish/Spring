package com.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Employee;

@RestController  // with this @ResponseBody will automatically comes inside it as @RestController = @Controller + @ResponseBody
@RequestMapping("/employee")
public class EmployeeRestController {
	
	@GetMapping("/getOne")
	public Employee showEmp()
	{
		return new Employee(10,"abc",7.8);
	}
	
	@GetMapping("/all")
	public List<Employee> showAllEmp()
	{
		return Arrays.asList(
				new Employee(11,"b",2.3),
				new Employee(12,"c",4.3),
				new Employee(13,"d",5.3)
				);
	}

}

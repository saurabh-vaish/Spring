package com.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.Employee;

@Controller
public class MyController {
	
	@RequestMapping("/show")
	public ModelAndView showView()
	{
		ModelAndView m = new ModelAndView();
		m.setViewName("home");
		// adding data to model object
		// 1 . premitive 
		m.addObject("eid", 55);
		
		//2. Object or refrence type (Employee Object)
		Employee e = new Employee();
		e.setEmpId(10);
		e.setEmpName("ABC");
		e.setEmpSal(4.4);
		
		m.addObject("emp", e);
		
		//3. Collection type
		
		List<Employee> elist = Arrays.asList(
				new Employee(55,"AA",3.3),
				new Employee(56, "BB", 5.5),
				new Employee(57,"CC",6.6)
				);
		m.addObject("emplist", elist);
	
		return m;
	}

}

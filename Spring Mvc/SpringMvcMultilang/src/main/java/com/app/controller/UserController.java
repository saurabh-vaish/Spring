package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.Student;
import com.app.validate.StudentValidator;

@Controller
public class UserController {

	@Autowired
	private StudentValidator validator;
	
	@RequestMapping("/reg")
	public String showRegister(ModelMap map) {
		// form backing object
		map.addAttribute("student", new Student());
		return "StudentRegistration";
	}

	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveStudent(@ModelAttribute Student student,Errors errors, ModelMap map)
	{
		// call validator method
		validator.validate(student, errors);
		String page="";
		
		if(errors.hasErrors())
		{
			//error exit
			page="StudentRegistration";
		}
		else
		{
			// no error
			page="StudentData";
			map.addAttribute("data", student);
		}
		return page;
	}
}

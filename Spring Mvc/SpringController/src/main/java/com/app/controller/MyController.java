package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/reg")
	public ModelAndView register()
	{
		ModelAndView m = new ModelAndView();
		m.setViewName("register");
		return m;
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public ModelAndView getRegister()
	{
		ModelAndView m = new ModelAndView();
		m.setViewName("success");
		return m;
	}
	
	@RequestMapping("/all")
	public ModelAndView show()
	{
		ModelAndView m = new ModelAndView();
		m.setViewName("allpage");
		return m;
	}
	
}

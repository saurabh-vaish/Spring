package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class HomeController {

	@RequestMapping("/show")
	public ModelAndView getPage() {
		ModelAndView m = new ModelAndView();
		m.setViewName("home");
		return m;
	}
}

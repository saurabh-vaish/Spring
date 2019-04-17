package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.model.User;

@Controller
public class UserController {

	@RequestMapping("/show")
	public String showRegPage(ModelMap map)
	{
		User user = new User();  // for bac
		user.setUserEmail("abc@gmk.com"); // setting data it will be available on jsp page
		map.addAttribute("user", user);
		return "userRegistration";
	}
	
	@RequestMapping("/save")
	public String saveUser(@ModelAttribute User user,ModelMap map)
	{
		map.addAttribute("msg", user);
		return "userRegistration";
	}
}

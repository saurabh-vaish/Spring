package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.model.User;
import com.app.service.IUserRegisterService;

@Controller
public class UserController {

	@Autowired
	private IUserRegisterService service;
	
	@RequestMapping("/show")
	public String showuserRegPage()
	{
		return "userReg";
	}
	
	@RequestMapping("/reg")
	public String showuserRegPage(@ModelAttribute User user, ModelMap map)
	{
		
		int i =service.saveUser(user);
		map.addAttribute("msg", user);
		return "userReg";
	}
}

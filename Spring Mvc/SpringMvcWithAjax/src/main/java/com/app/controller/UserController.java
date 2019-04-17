package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.model.User;
import com.app.service.IUserRegisterService;


@Controller
public class UserController {

	@Autowired
	private IUserRegisterService service;
	
	@RequestMapping("/show")
	public String showRegPage()
	{
		return "userReg";
	}
	
	
	@RequestMapping("/check")
	public @ResponseBody String checkMail(@RequestParam("mail")String mail)  //@ResponseBody for ajax call
	{
		String msg="";
		
		  List<User> user = service.getAllUsers(); System.out.println(user);
		  if(user.contains(mail))
		  {
			  System.out.println("yes");
			  msg="Email already exits .";
		  }
		 
		  
		  
		  return msg;
		
		/*
		 * if(mail.equalsIgnoreCase("ajay@gmail.com")) { msg="Email already exits ."; }
		 * return msg;
		 */
	}
	
	
}

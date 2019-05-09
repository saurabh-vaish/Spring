package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/all")
	public String showAll() {
		return "HomePage";
	}
	
	@RequestMapping("/emp")
	public String showEmp() {
		return "EmpPage";
	}
	
	@RequestMapping("/admin")
	public String showAdmin() {
		return "AdminPage";
	}
	
	@RequestMapping("/view")
	public String showView() {
		return "ViewPage";
	}
	
	@RequestMapping("/common")
	public String showCommon() {
		return "CommonPage";
	}
	
	@RequestMapping("/denied")
	public String showDenied() {
		return "DeniedPage";
	}
	
}
	
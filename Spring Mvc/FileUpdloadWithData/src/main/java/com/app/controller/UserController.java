package com.app.controller;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.app.dao.IUserDao;
import com.app.model.User;

@Controller
@RequestMapping("/user")
public class UserController {


	// directly with DAL layer , we are not using service layer here
	@Autowired
	private IUserDao dao;

	// show register page
	@RequestMapping("/show")
	public String showRegPage(ModelMap map)
	{
		map.addAttribute("user", new User());  // form Backing object
		return "userRegistration";
	}

	
	// save data with file 
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveUser(@ModelAttribute User user,@RequestParam CommonsMultipartFile uFile,ModelMap map )
	{
		if(uFile!=null)
		{
			user.setUserFileName(uFile.getOriginalFilename());
			user.setUserFileData(uFile.getBytes());

			Integer i = dao.saveUser(user);

			map.addAttribute("msg","data saved with id "+i);
		}
		return "userRegistration";
	}
	
	
	// get data from db
	@RequestMapping("/all")
	public String getUsers(ModelMap map)
	{
		map.addAttribute("user",dao.getAllUsers());
		return "allUsers";
	}
	
	

	// Display image
	@RequestMapping("/get")
	public String getOneUser(ModelMap map,@RequestParam Integer uid,HttpServletResponse resp)
	{
		User u = dao.getUserById(uid);
		
		try {
		//	FileCopyUtils.copy(u.getUserFileData(),resp.getOutputStream());
			resp.setContentType("image/jpeg");
			//resp.getOutputStream().write(u.getUserFileData());
			InputStream inputStream = new ByteArrayInputStream(u.getUserFileData());
			IOUtils.copy(inputStream, resp.getOutputStream());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		map.addAttribute("user",u);
		
		return "userData";
	}
	
	
	
}

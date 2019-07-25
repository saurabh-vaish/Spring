package com.app.component;

import org.springframework.stereotype.Service;

@Service
public class MyService {

	
	public void getData()
	{
		System.out.println("form buisness class method");
	}
	
	
	public void buisnessMethod()
	{
		System.out.println("from buisness method");
	}

	/*
	// if want to see after execution method
	public void buisnessMethod()
	{
		try {
		System.out.println("from buisness method");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	*/
	
}

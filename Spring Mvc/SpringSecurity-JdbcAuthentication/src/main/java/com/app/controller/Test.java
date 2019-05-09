package com.app.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Test {

	public static void main(String[] args) {
		BCryptPasswordEncoder enc=new BCryptPasswordEncoder();
		String str=enc.encode("ajay");
		System.out.println(str);
		
		
	}
}

package com.app.test;

import java.io.File;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.app.config.AppConfig;
import com.app.util.AppMailSender;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		AppMailSender sender = ac.getBean("appMailSender", AppMailSender.class);

		FileSystemResource file = new FileSystemResource("C:\\Users\\The_Incredible_Srv\\Pictures\\Saved Pictures\\windows_11.jpg");

		boolean res =sender.sendMail("saurabhvaish93@gmail.com","bhumikarajwani@gmail.com","hello user","hii i m ganerated from spring app",file);

		if(res==true)
		{
			System.out.println("done");
		}
		else
		{
			System.out.println("failure");
		}


	}

}

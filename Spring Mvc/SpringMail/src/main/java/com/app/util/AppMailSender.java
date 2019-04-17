package com.app.util;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class AppMailSender {

	@Autowired
	private JavaMailSender mailSender;
	
	public boolean sendMail(String to,String from,String subject,String text,FileSystemResource file)
	{
		boolean status = false;
		
		try {
		// create MimeMessage class object
		MimeMessage message =mailSender.createMimeMessage();
	
		// create MimeMessageHelper class object
		MimeMessageHelper helper = new MimeMessageHelper(message, file!=null?true:false);  // it there will be file then with attachment or not
		
		// provide details
		helper.setTo(to);
		helper.setSubject(subject);
		helper.setText(text);
		helper.setFrom(from);
		helper.addAttachment(file.getFilename(), file);
		
		//send mail
		mailSender.send(message);
		
		status=true;
		
		}
		catch (Exception e) {
			status = false;
			e.printStackTrace();
		}
		return status;
	}
	
}

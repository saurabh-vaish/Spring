package com.app.validate;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.app.model.Student;

@Component
public class StudentValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Student.class.equals(clazz);
		//return clazz.isAssignableFrom(Student.class);  // it also can be used
	}

	@Override
	public void validate(Object target, Errors errors) {
		Student s = (Student) target;
		String patternName = "[A-Z]{2,}";
		String patternEmail ="^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
		String patternPwd = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,}";
		
		
		if(s.getStdName()==null || s.getStdName().equals(""))
		{
			errors.rejectValue("stdName", null, "please enter your name");
		}
		else if(!Pattern.matches(patternName,s.getStdName()))
		{
			errors.rejectValue("stdName", null, "please enter valid name");
		}
		
		if(s.getStdCourse()==null || s.getStdCourse().equals(""))
		{
			errors.rejectValue("stdCourse", null, "please select a course");
		}
		
		if(s.getStdLangs()==null || s.getStdLangs().isEmpty())
		{
			errors.rejectValue("stdName", null, "please select at least one Laguage");
		}
		
		if(s.getStdAddr()==null || s.getStdAddr().equals(""))
		{
			errors.rejectValue("stdAddr", null, "please enter your address");
		}
		
		if(s.getStdEmail()==null || s.getStdEmail().equals(""))
		{
			errors.rejectValue("stdEmail", null, "please enter your email");
		}
		else if(!Pattern.matches(patternEmail,s.getStdEmail()))
		{
			errors.rejectValue("stdEmail", null, "please enter valid email");
		}
		
		if(s.getStdPwd()==null || s.getStdPwd().equals(""))
		{
			errors.rejectValue("stdPwd", null, "please enter your password");
		}
		else if(s.getStdPwd().length()<6)
		{
			errors.rejectValue("stdPwd", null, "pasword should cotain at least 6 charectors");
		}
		else if(!Pattern.matches(patternPwd,s.getStdPwd()))
		{
			errors.rejectValue("stdPwd", null, "password should contain at least one number, one lowercase and one uppercase letter");
		}
		
		
	}

}

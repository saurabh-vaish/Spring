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
		
		
		if(s.getStdName()==null || s.getStdName().equals("") || !Pattern.matches(patternName,s.getStdName()))
		{
			errors.rejectValue("stdName", "errorName");
		}
		
		if(s.getStdCourse()==null || s.getStdCourse().equals(""))
		{
			errors.rejectValue("stdCourse", "errorCrs");
		}
		
		
		if(s.getStdLangs()==null || s.getStdLangs().isEmpty())
		{
			errors.rejectValue("stdLangs", "errorLang");
		}
		
		
		if(s.getStdAddr()==null || s.getStdAddr().equals(""))
		{
			errors.rejectValue("stdAddr", "errorAdd");
		}
		
		
		if(s.getStdEmail()==null || s.getStdEmail().equals("") || !Pattern.matches(patternEmail,s.getStdEmail()))
		{
			errors.rejectValue("stdEmail", "errorMail");
		}
		
		
		
		if(s.getStdPwd()==null || s.getStdPwd().equals("") || !Pattern.matches(patternPwd,s.getStdPwd()))
		{
			errors.rejectValue("stdPwd", "errorPwd");
		}
		
		
	}

}

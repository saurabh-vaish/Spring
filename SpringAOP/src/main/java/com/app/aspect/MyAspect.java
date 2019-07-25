package com.app.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 *  Aspect --> It is a class which provide external services . 
 * 	
 * 	Pointcut --> It is an expression which select advices for business methods . But didn't tell what advice   
 * 
 * 	Advice --> Its a method in aspect which provide external service .
 * 
 * 
 * 	**** when ever any method which will match with given expression matches then its corresponding method will execute
 * 
 *  Note --> If multiple methods are having same advice then they will execute based on their names[unicode] [0-9,A-Z,_,a-z] 
 *  
 *   		We can define multiple pointscuts , The method which will match those pointcuts will execute
 *   		
 *   		we can also use multiple pointcut in one method using && , || 
 * 
 * */





@Aspect				// i.e. it is aspect class
@Component
public class MyAspect {

	
	@Pointcut("execution(public * com.app.*.*.get*())")  // selecting method for advice  
	public void p1() { }									// method with any name
	
	
	@Before("p1()")   // advice + pointcut = joint point
	public void fromAspect()
	{
		System.out.println("before buisness method");
	}
	
	
	// all type of advice 
	
	@Pointcut("execution(public * com.app..*.*())")  // selecting method for advice   [app package classes and all its sub packages classes]
	public void m1() { }									// method with any name
	
	
	@After("m1()")
	public void showAfter()
	{
		System.out.println("after buisness method");
	}
	
	
	@Around("m1()")
	public void showAround(ProceedingJoinPoint jt)  // for using proceed method
	{
		System.out.println("before method - 1st part");
		try {
				jt.proceed();
			} catch (Throwable e) {
				e.printStackTrace();
			}
		System.out.println("after method - 2nd part");
		
	}
	
	
	@AfterReturning("m1()")
	public int showAfterReturning()
	{
		System.out.println("after successfull execution of buisness method");
		return 1;
	}
	
	
	@AfterThrowing("m1()")
	public void showAfterThrowing()
	{
		System.out.println("after buisness method throw exception");
	}
	
}

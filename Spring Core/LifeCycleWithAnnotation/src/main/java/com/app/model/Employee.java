package com.app.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("app.properties")
public class Employee  {

	@Value("${id}")
	private int empId;
	@Value("${name}")
	private String empName;
	
	@PostConstruct
	public void init()
	{
		System.out.println("from init method");
	}
	
	@PreDestroy
	public void des()
	{
		System.out.println("from destroy method");
	}
	
	public Employee() {
		super();
		System.out.println("object created");
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}

	
	
	
	
}

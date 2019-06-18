package com.app.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean,DisposableBean {

	private int empId;
	private String empName;
	
	@Override
	public void destroy() throws Exception {
		System.out.println("From destroy method");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("From init method");
		
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

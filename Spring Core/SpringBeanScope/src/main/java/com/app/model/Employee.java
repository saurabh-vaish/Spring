package com.app.model;

import org.springframework.context.annotation.Scope;

//@Component
@Scope("prototype")     // to provide prototype scope
public class Employee {

	private Integer empId;
	private String empName;
	
	// default constructor so that container can make its object and initialize using setters/getters
	
	public Employee()     
	{
		super();
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
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

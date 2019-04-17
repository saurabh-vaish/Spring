package com.app.model;

public class Employee {

	private int empId;
	private String empName;
	
	public void init()
	{
		System.out.println("from init method");
	}
	
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

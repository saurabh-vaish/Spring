package com.app.model;

/**
 *  Parameterized Constructor  Injection --->  We can also inject dependencies using parameterized  cons. .
 *  											 Then we do not need Setter Methods
 *    
 *
 * 
 * **/


public class Employee {

	private Integer empId;
	
	private String empName;
	
	private Address addr;
	
	public Employee() {
		super();
	}	

	public Employee(Integer empId, String empName, Address addr) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.addr = addr;
	}

	

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", addr=" + addr + "]";
	}

	
	
	
	
}

	
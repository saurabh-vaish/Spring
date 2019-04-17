package com.app.model;

public class Employee {

	private int empId;
	private String empName;
	private int empAge;
	private String empGen;
	private String empAddr;
	
	

	public Employee(int empId, String empName, int empAge, String empGen, String empAddr) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empGen = empGen;
		this.empAddr = empAddr;
	}



	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empGen=" + empGen
				+ ", empAddr=" + empAddr + "]";
	}
	
	
	
	
}

package com.app.model;


// child bean

public class Address {

	private Employee emp;

	
	/*
	 * public Address(Employee emp) { super(); this.emp = emp; }
	 */

		
	public Address() {
		super();
	}
	
	public Employee getEmp() {
		return emp;
	}


	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Address [emp=" + emp + "]";
	}
	
	
	
	
}

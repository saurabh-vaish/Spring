package com.app.model;

/**
 *  Circular Dependency -->  While creating object when one class object needed second class object and second class needed first class object
 *  						 then constructors can't create object and throws exception .  Then this problem is called circular dependency problem.
 *  
 *  		To overcome with this problem use -- setter methods in both classes with default constructors 
 *  											In one class setter and another constructor.
 *
 * 
 * **/


public class Employee {
	
	private Address addr;

	/*
	 * if both class will have param const injection then exception will come
	 * 
	 * public Employee(Address addr) { super(); this.addr = addr; }   
	 */

	public Employee() {
		super();
	}
	

	public Address getAddr() {
		return addr;
	}




	public void setAddr(Address addr) {
		this.addr = addr;
	}


	

	

}

	
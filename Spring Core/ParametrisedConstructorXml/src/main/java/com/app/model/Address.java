package com.app.model;


// child bean

public class Address {

	private Integer addrId;
	
	private String address;
	
	public Address() {
		super();
	}
	
	public Address(Integer addrId, String address) {
		super();
		this.addrId = addrId;
		this.address = address;
	}
	
	
	
	@Override
	public String toString() {
		return "Address [addrId=" + addrId + ", address=" + address + "]";
	}
	
	
	
}

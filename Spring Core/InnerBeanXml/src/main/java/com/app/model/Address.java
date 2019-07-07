package com.app.model;


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
	
	public Integer getAddrId() {
		return addrId;
	}
	
	public void setAddrId(Integer addrId) {
		this.addrId = addrId;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Address [addrId=" + addrId + ", address=" + address + "]";
	}
	
	
	
}

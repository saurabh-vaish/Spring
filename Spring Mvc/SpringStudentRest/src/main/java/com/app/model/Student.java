package com.app.model;


public class Student {

	private Integer stdId;
	private String stdName;
	private Double stdFee;
	
	
	
	public Student() {
		super();
	}
	public Student(Integer stdId, String stdName, Double stdFee) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdFee = stdFee;
	}
	
	
	public Integer getstdId() {
		return stdId;
	}
	public void setstdId(Integer stdId) {
		this.stdId = stdId;
	}
	public String getstdName() {
		return stdName;
	}
	public void setstdName(String stdName) {
		this.stdName = stdName;
	}
	public Double getstdFee() {
		return stdFee;
	}
	public void setstdFee(Double stdFee) {
		this.stdFee = stdFee;
	}
	
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdFee=" + stdFee + "]";
	}
	
	
	
}

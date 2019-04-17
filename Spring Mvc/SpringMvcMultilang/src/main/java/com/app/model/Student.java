package com.app.model;

import java.util.List;

public class Student {

	private Integer id;
	private String stdName;
	private String stdCourse;
	private String stdEmail;
	private String stdPwd;
	private List<String> stdLangs;
	private String stdAddr;
	
	public Student() {
		super();
	}

	public Student(Integer id, String stdName, String stdCourse, String stdEmail, String stdPwd, List<String> stdLangs,
			String stdAddr) {
		super();
		this.id = id;
		this.stdName = stdName;
		this.stdCourse = stdCourse;
		this.stdEmail = stdEmail;
		this.stdPwd = stdPwd;
		this.stdLangs = stdLangs;
		this.stdAddr = stdAddr;
	}

	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdCourse() {
		return stdCourse;
	}

	public void setStdCourse(String stdCourse) {
		this.stdCourse = stdCourse;
	}

	public String getStdEmail() {
		return stdEmail;
	}

	public void setStdEmail(String stdEmail) {
		this.stdEmail = stdEmail;
	}

	public String getStdPwd() {
		return stdPwd;
	}

	public void setStdPwd(String stdPwd) {
		this.stdPwd = stdPwd;
	}

	public List<String> getStdLangs() {
		return stdLangs;
	}

	public void setStdLangs(List<String> stdLangs) {
		this.stdLangs = stdLangs;
	}

	public String getStdAddr() {
		return stdAddr;
	}

	public void setStdAddr(String stdAddr) {
		this.stdAddr = stdAddr;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", stdName=" + stdName + ", stdCourse=" + stdCourse + ", stdEmail=" + stdEmail
				+ ", stdPwd=" + stdPwd + ", stdLangs=" + stdLangs + ", stdAddr=" + stdAddr + "]";
	}
	
	
	
}

package com.app.model;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("${name}")
	private String stdName;
	@Value("#{sCourse}")
	private Set<String> stdCourse;
	@Value("#{sAdd}")
	private Map<Integer,String> stdAdd;
	
	@Autowired
	private Course cob;
	
	public Student() {
		super();
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public Set<String> getStdCourse() {
		return stdCourse;
	}

	public void setStdCourse(Set<String> stdCourse) {
		this.stdCourse = stdCourse;
	}

	public Map<Integer, String> getStdAdd() {
		return stdAdd;
	}

	public void setStdAdd(Map<Integer, String> stdAdd) {
		this.stdAdd = stdAdd;
	}

	public Course getCob() {
		return cob;
	}

	public void setCob(Course cob) {
		this.cob = cob;
	}

	@Override
	public String toString() {
		return "Student [stdName=" + stdName + ", stdCourse=" + stdCourse + ", stdAdd=" + stdAdd + ", cob=" + cob + "]";
	}
	
	
}

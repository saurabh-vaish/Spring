package com.app.model;

import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Course {

	@Value("121")
	private int cid;
	@Value("#{clist}")
	private List<String> cname;
	@Value("#{cProp}")
	private Properties ccost;
	
	public Course() {
		super();
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public List<String> getCname() {
		return cname;
	}

	public void setCname(List<String> cname) {
		this.cname = cname;
	}

	public Properties getCcost() {
		return ccost;
	}

	public void setCcost(Properties ccost) {
		this.ccost = ccost;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", ccost=" + ccost + "]";
	}
	
	
	
}

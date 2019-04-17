package com.app.model;

import java.util.List;
import java.util.Properties;

public class Course {

	private int cid;
	private List<String> cname;
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

package com.app.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

public class User {

	private int id;
	private String userName;
	private String userEmail;
	private String userPwd;
	private String userRoles;
	
	public User() {
		super();
	}

	public User(int id) {
		super();
		this.id = id;
	}

	public User(int id, String userName, String userEmail, String userPwd, String userRoles) {
		super();
		this.id = id;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPwd = userPwd;
		this.userRoles = userRoles;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(String userRoles) {
		this.userRoles = userRoles;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userEmail=" + userEmail + ", userPwd=" + userPwd
				+ ", userRoles=" + userRoles + "]";
	}

	
	
}

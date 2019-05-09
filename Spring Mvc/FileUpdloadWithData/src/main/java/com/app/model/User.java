package com.app.model;

import java.util.Arrays;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name="userTab")
@SecondaryTable(name="userFile")    // here we are using secondary table bcs we are storing files to different table
public class User {

	@Id
	@GeneratedValue
	@Column(name="uid")
	private int id;
	@Column(name="uname")
	private String userName;
	@Column(name="uemail")
	private String userEmail;
	@Column(name="upwd")
	private String userPwd;
	
	@Column(name="ufileName",table="userFile")
	private String userFileName;
	
	@Column(name="ufileData",table="userFile")
	@Lob
	private byte[] userFileData;
	
	public User() {
		super();
	}

	public User(int id) {
		super();
		this.id = id;
	}

	
	public User(int id, String userName, String userEmail, String userPwd, String userFileName, byte[] userFileData) {
		super();
		this.id = id;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPwd = userPwd;
		this.userFileName = userFileName;
		this.userFileData = userFileData;
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

	public String getUserFileName() {
		return userFileName;
	}

	public void setUserFileName(String userFileName) {
		this.userFileName = userFileName;
	}

	public byte[] getUserFileData() {
		return userFileData;
	}

	public void setUserFileData(byte[] userFileData) {
		this.userFileData = userFileData;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userEmail=" + userEmail + ", userPwd=" + userPwd
				+ ", userFileName=" + userFileName + ", userFileData=" + Arrays.toString(userFileData) + "]";
	}

		
	
	
}

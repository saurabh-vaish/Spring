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
@SecondaryTable(name="userImage_Sign")    // here we are using secondary table bcs we are storing files to different table
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
	
	@Column(name="uImageName",table="userImage_Sign")
	private String userImageName;
	
	@Column(name="uImageData",table="userImage_Sign")
	@Lob
	private byte[] userImageData;
	
	@Column(name="uSignName",table="userImage_Sign")
	private String userSignName;
	
	@Column(name="uSignData",table="userImage_Sign")
	@Lob
	private byte[] userSignData;
	
	public User() {
		super();
	}

	public User(int id) {
		super();
		this.id = id;
	}

	
	
	public User(int id, String userName, String userEmail, String userPwd, String userImageName, byte[] userImageData,
			String userSignName, byte[] userSignData) {
		super();
		this.id = id;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPwd = userPwd;
		this.userImageName = userImageName;
		this.userImageData = userImageData;
		this.userSignName = userSignName;
		this.userSignData = userSignData;
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

	public String getUserImageName() {
		return userImageName;
	}

	public void setUserImageName(String userImageName) {
		this.userImageName = userImageName;
	}

	public byte[] getUserImageData() {
		return userImageData;
	}

	public void setUserImageData(byte[] userImageData) {
		this.userImageData = userImageData;
	}

	public String getUserSignName() {
		return userSignName;
	}

	public void setUserSignName(String userSignName) {
		this.userSignName = userSignName;
	}

	public byte[] getUserSignData() {
		return userSignData;
	}

	public void setUserSignData(byte[] userSignData) {
		this.userSignData = userSignData;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userEmail=" + userEmail + ", userPwd=" + userPwd
				+ ", userImageName=" + userImageName + ", userImageData=" + Arrays.toString(userImageData)
				+ ", userSignName=" + userSignName + ", userSignData=" + Arrays.toString(userSignData) + "]";
	}

	
		
	
	
}

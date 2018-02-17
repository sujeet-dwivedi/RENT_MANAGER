package com.rmngr.bean;

public class User {

	private String userName;
	private String password;
	private String rePassword;
	private String firstName;
	private String lastName;
	private String emailId;
	private String phone;
	private int userId;


	public User() {
		super();
	}





	public User(String userName, String password, String rePassword, String firstName, String lastName,
			String emailId, String phone, int userId) {
		super();
		this.userName = userName;
		this.password = password;
		this.setRePassword(rePassword);
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.phone = phone;
		this.userId = userId;
	}





	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}





	public String getRePassword() {
		return rePassword;
	}





	public void setRePassword(String rePassword) {
		this.rePassword = rePassword;
	}
	
	






}

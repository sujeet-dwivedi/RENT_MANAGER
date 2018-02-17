package com.rmngr.bean;

public class Renter {
	
	private int renterId;
	private String firstName;
	private String lastName;
	private String emailId;
	private String dob;
	private String aadhaarNo;
	private String phone;
	private String address;
	private int pincode;
	private String city;
	private String state;
	
	public Renter() {
		super();
	}

	public Renter(int renterId, String firstName, String lastName, String emailId, String dob, String aadhaarNo,
			String phone, String address, int pincode, String city, String state) {
		super();
		this.renterId = renterId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.dob = dob;
		this.aadhaarNo = aadhaarNo;
		this.phone = phone;
		this.address = address;
		this.pincode = pincode;
		this.city = city;
		this.state = state;
	}



	public int getRenterId() {
		return renterId;
	}

	public void setRenterId(int renterId) {
		this.renterId = renterId;
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAadhaarNo() {
		return aadhaarNo;
	}

	public void setAadhaarNo(String aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
	
	

}

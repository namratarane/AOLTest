package com.account.dto;

public class AccountDetails {
	private String fname;
	private String lname;
	private String email;
	private String newsletter;
	private String password;
	private String confirmPassword;

	public AccountDetails() {
		
	}
	public AccountDetails(String fname, String lname, String email, String newsletter, String password, String confirmPassword) {
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.newsletter = newsletter;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNewsletter() {
		return newsletter;
	}
	public void setNewsletter(String newsletter) {
		this.newsletter = newsletter;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	
	
	

}

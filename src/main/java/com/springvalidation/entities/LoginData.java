package com.springvalidation.entities;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class LoginData {
	
	@NotBlank(message = "User Name can not be empty")
	@Size(min = 3,max = 12, message = "User name must be between 3 - 12 Characters!!")
	private String userName;
	
	@NotBlank(message = "Please Select Genader")
	private String gender;
	
	@NotBlank(message = "Please Enter DOB")
	private String dob;
	
	@Email(regexp = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")
	private String email;
	
	@NotBlank(message = "Address can not be empty")
	@Size(min = 5,max = 12, message = "Address must be between 5 - 12 Characters!!")
	private String address;
	
	@NotBlank(message = "Password can not be empty")
	@Pattern(message = "example : Abc@1996",regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")
	
	private String password;
	
	@AssertTrue(message = "Must agree term and conditions !!!")
	private boolean agreed;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean isAgreed() {
		return agreed;
	}
	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}
	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginData [userName=" + userName + ", gender=" + gender + ", dob=" + dob + ", email=" + email
				+ ", address=" + address + ", password=" + password + ", agreed=" + agreed + "]";
	}
	
	
	
	
}

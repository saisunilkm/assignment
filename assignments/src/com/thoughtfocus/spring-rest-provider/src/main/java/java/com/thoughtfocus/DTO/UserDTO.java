package com.thoughtfocus.DTO;

import java.io.Serializable;

public class UserDTO implements Serializable {
	private String username;
	private String password;
	private String confirmpassword;
	private Long MobileNumber;
	private Double age;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	public Long getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		MobileNumber = mobileNumber;
	}

	public Double getAge() {
		return age;
	}

	public void setAge(Double age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserDTO [username=" + username + ", password=" + password + ", confirmpassword=" + confirmpassword
				+ ", MobileNumber=" + MobileNumber + ", age=" + age + "]";
	}

}

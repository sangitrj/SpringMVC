package com.example.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Login {
	@Size(min=5, max=10, message="User name should be between {min} and {max} characters")
	private String name;
	
	@Pattern(regexp="[a-zA-Z0-9]{6,8}", message="Password should be 6-8 character and should contains only a-z, A-Z and 0-9")
	private String password;
	
	@Min(value=1000, message="Code should be greater than or equal to 1000")
	@Max(value=9999, message="Code should be less than or equal to 9999")
	private Integer code;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	
}

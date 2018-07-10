package com.example.dto;

import javax.validation.constraints.Size;

public class Login {
	@Size(min=5, max=10)
	private String name;
	private Integer password;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPassword() {
		return password;
	}
	public void setPassword(Integer password) {
		this.password = password;
	}
	
}

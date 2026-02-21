package com.example.DTO;

import jakarta.validation.constraints.NotBlank;

public class CustomerDTO {

	@NotBlank(message = "This field is required")
	private String cusName;
	@NotBlank(message = "Email cann't be null or blank")
	private String email;
	
	public CustomerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerDTO(String cusName, String email) {
		super();
		this.cusName = cusName;
		this.email = email;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}

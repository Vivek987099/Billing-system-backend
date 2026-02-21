package com.example.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DTO.CustomerDTO;
import com.example.serviceImple.CustomerServiceImple;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	@Autowired
	private CustomerServiceImple customerServiceImple;
	
	@PostMapping("/create-customer")
	public ResponseEntity<?> createNewUser(@Valid @RequestBody CustomerDTO customerDTO) {
		
		 String message= this.customerServiceImple.createCustomer(customerDTO);
		
		return ResponseEntity.ok(Map.of("message",message));
	}

}

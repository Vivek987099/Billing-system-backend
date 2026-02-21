package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DTO.CustomerDTO;
import com.example.Repository.CustomerRepository;
import com.example.entity.Customer;
import com.example.helperClasses.GenerateIDs;
import com.example.service.CustomerService;

import jakarta.transaction.Transactional;
@Service
public class CustomerServiceImple implements CustomerService{
	@Autowired
	private GenerateIDs generateIDs;
	@Autowired
	private CustomerRepository customerRepository;
	
	@Transactional
	@Override
	public String createCustomer(CustomerDTO customerDTO) {
		
		Customer customer = new Customer(customerDTO.getCusName(),customerDTO.getEmail());
		this.customerRepository.save(customer);
		customer.setCustomerId(this.generateIDs.generateCustId(customer.getId()));
		return "customer created";
	}

}

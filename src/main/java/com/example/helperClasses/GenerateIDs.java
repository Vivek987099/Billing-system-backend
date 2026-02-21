package com.example.helperClasses;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class GenerateIDs {
	
	
	public String generateCustId(int id) {
		 Integer year= LocalDate.now().getYear();
		   String lastTwodigits= year.toString().substring(2);
		    return "CUST-"+lastTwodigits+String.format("%05d", id);
		
	}
	
	
	
	

}

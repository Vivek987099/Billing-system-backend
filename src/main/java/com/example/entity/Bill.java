package com.example.entity;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Bill {
    private Long id;
    private String billNo;
    private Double totalAmount;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Custumer custumer;
	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bill(Long id, String billNo, Double totalAmount, Custumer custumer) {
		super();
		this.id = id;
		this.billNo = billNo;
		this.totalAmount = totalAmount;
		this.custumer = custumer;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBillNo() {
		return billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Custumer getCustumer() {
		return custumer;
	}

	public void setCustumer(Custumer custumer) {
		this.custumer = custumer;
	}
    
    
    
    
    
}

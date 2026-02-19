package com.example.entity;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String billNo;
    private Double totalAmount;
    @OneToMany(mappedBy = "bill", cascade = CascadeType.ALL)
    private List<BillService> billServices;
    
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

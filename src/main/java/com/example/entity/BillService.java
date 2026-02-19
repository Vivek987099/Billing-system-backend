package com.example.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class BillService {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer qty;
	private Double price;
	private Double total;
	@ManyToOne
	@JoinColumn(name = "bill_id")
	private Bill bill;

	@ManyToOne
	@JoinColumn(name = "service_id")
	private List<HService> hServices;

	public BillService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BillService(Long id, Integer qty, Double price, Double total) {
		super();
		this.id = id;
		this.qty = qty;
		this.price = price;
		this.total = total;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

}

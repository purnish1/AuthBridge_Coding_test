package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ProductEmployee {

	@Id
	@GeneratedValue
	private Long id;
	@ManyToOne
	@JoinColumn(name="employee_id")
	private Employee e;
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product p;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Employee getE() {
		return e;
	}
	public void setE(Employee e) {
		this.e = e;
	}
	public Product getP() {
		return p;
	}
	public void setP(Product p) {
		this.p = p;
	}
	
	
}

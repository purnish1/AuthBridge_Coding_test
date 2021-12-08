package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="productName",length=64)
	private String productName;
	
	@Column(name="productType",length=64)
	private String productType;
	
	@Column(name="modelNumber",length=64)
	private String modelNumber;
	
	@Column(name="price")
	private int price;
	
	@Column(name="manufacturerCompanyName",length=64)
	private String manufacturerCompanyName;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getManufacturerCompanyName() {
		return manufacturerCompanyName;
	}
	public void setManufacturerCompanyName(String manufacturerCompanyName) {
		this.manufacturerCompanyName = manufacturerCompanyName;
	}
	
	
	
	
	
}

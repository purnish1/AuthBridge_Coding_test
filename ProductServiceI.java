package com.example.service;

import java.util.List;

import com.example.model.Employee;
import com.example.model.Product;

public interface ProductServiceI {
	public Long saveProduct(Product p);

	public List<String> getProductLikeName(String name);

	public List<String> getProductInPriceRange(int low, int high);

	public void removeProduct(Long pId);

	public Product updateProduct(Product p);

	public Product getProductById(Long empId);
}

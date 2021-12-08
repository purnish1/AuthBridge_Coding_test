package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ProductRepository;
import com.example.model.Employee;
import com.example.model.Product;

@Service
public class ProductService implements ProductServiceI{
	
	

	@Autowired
	private ProductRepository dao; 
	
	public Long saveProduct(Product p) {
		dao.save(p);
		return p.getId();
	}

	@Override
	public Product getProductById(Long pId) {
		Product p=dao.findById(pId).get();
		return p;
	}
	
	@Override
	public List<String> getProductLikeName(String name) {
		List<String> prods=dao.getProductLikeName(name);
		return prods;
	}

	@Override
	public List<String> getProductInPriceRange(int low, int high) {
		List<String> prods=dao.getProductInPriceRange(low,high);
		return prods;
	}

	@Override
	public void removeProduct(Long pId) {
		dao.removeProduct(pId);
	}

	@Override
	public Product updateProduct(Product p) {
		dao.save(p);
		return p;
	}
	

}

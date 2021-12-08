package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.model.Product;
import com.example.service.EmployeeServiceI;
import com.example.service.ProductServiceI;

@RestController
public class ProductController {

	@Autowired
	private ProductServiceI productService;
	
	@ResponseBody
	@PostMapping(path="/save-product-data")
	public String saveEmployeeRegistration(@RequestBody Product p) {
		productService.saveProduct(p);
		return "Product info saved successfully with id:"+p.getId();
	}
	
	@ResponseBody
	@PostMapping(path="/remove-employee-data")
	public String removeProduct(@RequestParam(name="pId") Long pId) {
		productService.removeProduct(pId);
		return "Product removed:";
	}
	
	@ResponseBody
	@PostMapping(path="/get-product-like-name")
	public List<String> getProductLikeName(@RequestParam(name="pName") String name) {
		List<String> prodNames=productService.getProductLikeName(name);
		return prodNames;
	}
	
	@ResponseBody
	@PostMapping(path="/get-product-in-price-range")
	public List<String> getProductInPriceRange(@RequestParam(name="lowPrice") int low,
			@RequestParam(name="highPrice") int high) {
		List<String> prodNames=productService.getProductInPriceRange(low,high);
		return prodNames;
	}
	
	@ResponseBody
	@PutMapping(path="/update-product")
	public Product updateProduct(@RequestBody Product p) {
		Product pNew=productService.updateProduct(p);
		return pNew;
	}
	
	@ResponseBody
	@GetMapping(path="/get-product-by-id")
	public Product getProductById(@RequestParam(name="pId") Long pId) {
		Product p=productService.getProductById(pId);
		return p;
	}
}

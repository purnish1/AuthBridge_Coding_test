package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Product;
import com.example.model.ProductEmployee;
import com.example.service.EmployeeProductServiceI;

@RestController
public class EmployeeProductController {

	@Autowired
	private EmployeeProductServiceI service;
	
	@ResponseBody
	@PostMapping(path="/save-employee-product-data")
	public String saveEmployeeRegistration(@RequestParam(name = "empId") Long eId,@RequestParam(name="pId") Long pId) {
		service.saveEmployeeProduct(eId,pId);
		return "Product info saved successfully with id:";
	}
	
	@ResponseBody
	@PostMapping(path="/get-products-for-employee")
	public String getProductsForEmployee(@RequestParam(name="empId") Long eId) {
		String prods=service.getProductsForEmployee(eId);
		return prods;
	}
	
	@ResponseBody
	@PostMapping(path="/remove-product-for-employee")
	public String removeProductForEmployee(@RequestParam(name="empId") Long eId,
			@RequestParam(name="pId") Long pId) {
		service.removeProductForEmployee(eId,pId);
		return "deleted";
	}
}

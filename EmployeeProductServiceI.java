package com.example.service;

import com.example.model.ProductEmployee;

public interface EmployeeProductServiceI {
	public Long saveEmployeeProduct(Long empId, Long prodId);
	
	public String getProductsForEmployee(Long eId);
	
	public String removeProductForEmployee(Long eId, Long pId);
	
}

package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EmployeeProductRepository;
import com.example.dao.EmployeeRepository;
import com.example.dao.ProductRepository;
import com.example.model.Employee;
import com.example.model.Product;
import com.example.model.ProductEmployee;

@Service
public class EmployeeProductService implements EmployeeProductServiceI {

	@Autowired
	private EmployeeProductRepository dao;
	@Autowired
	private EmployeeRepository empRepo;
	@Autowired
	private ProductRepository prodRepo;
	
	
	@Override
	public Long saveEmployeeProduct(Long empId,Long pId) {
		Optional<Employee> opE = empRepo.findById(empId);
		Employee e=opE.get();
		Optional<Product> opP = prodRepo.findById(pId);
		Product p=opP.get();
		ProductEmployee ep=new ProductEmployee();
		ep.setE(e);
		ep.setP(p);
		dao.save(ep);
		return null;
	}


	@Override
	public String getProductsForEmployee(Long eId) {
		List<Product> products=dao.findProductsByEmployeeId(eId);
		return products.toString();
	}


	@Override
	public String removeProductForEmployee(Long eId, Long pId) {
		dao.removeProductForEmployee(eId,pId);
		return null;
	}
	
	
}

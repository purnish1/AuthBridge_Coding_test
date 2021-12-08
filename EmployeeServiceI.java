package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Employee;

public interface EmployeeServiceI {

	public Long saveEmployeeData(Employee e);
	
	public List<String> getEmployeeLikeName(String name);

	public void removeEmployee(Long eId);

	public Employee updateEmployee(Employee e);

	public Employee getEmployeeById(Long empId);
}

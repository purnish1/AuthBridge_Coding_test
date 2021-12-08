package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.dao.EmployeeRepository;
import com.example.model.Employee;

@Service
public class EmployeeService implements EmployeeServiceI{
	@Autowired
	private EmployeeRepository employeeDao;
	
	public EmployeeRepository getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeRepository employeeDao) {
		this.employeeDao = employeeDao;
	}

	public Long saveEmployeeData(Employee e) {
		employeeDao.save(e);
		return 23l;
	}

	@Override
	public List<String> getEmployeeLikeName(String name) {
		// TODO Auto-generated method stub
		List<String> eName=employeeDao.findEmployeeLikeName(name);
		return eName;
	}

	@Override
	public void removeEmployee(Long eId) {
		employeeDao.removeEmployee(eId);
		
	}

	@Override
	public Employee updateEmployee(Employee e) {
		Employee e2=employeeDao.save(e);
		return e2;
	}

	@Override
	public Employee getEmployeeById(Long empId) {
		Employee e=employeeDao.findById(empId).get();
		return e;
	}
	
	
}

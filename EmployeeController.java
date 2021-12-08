package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.service.EmployeeService;
import com.example.service.EmployeeServiceI;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceI empService;
	
	@ResponseBody
	@PostMapping(path="/save-employee-data")
	public String saveEmployeeRegistration(@RequestBody Employee e) {
		empService.saveEmployeeData(e);
		return "Employee info saved successfully with id:"+e.getId();
	}
	
	@ResponseBody
	@DeleteMapping(path="/remove-employee")
	public String removeEmployee(@RequestParam(name="eId") Long eId) {
		empService.removeEmployee(eId);
		return "deleted";
	}
	
	@ResponseBody
	@PostMapping(path="/get-employee-like-name")
	public List<String> getEmployeeLikeName(@RequestParam(name="eName") String name) {
		List<String> empNames=empService.getEmployeeLikeName(name);
		return empNames;
	}
	
	@ResponseBody
	@PutMapping(path="/update-employee")
	public Employee updateEmployee(@RequestBody Employee e) {
		e=empService.updateEmployee(e);
		return e;
	}
	
	@ResponseBody
	@GetMapping(path="/get-employee-by-id")
	public Employee getEmployeeById(@RequestParam(name="empId") Long empId) {
		Employee e=empService.getEmployeeById(empId);
		return e;
	}
}

package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.controller.EmployeeController;
import com.example.model.Employee;
import com.example.service.EmployeeService;

@SpringBootApplication
@EnableAutoConfiguration
public class EmployePortal1Application {

	
	public static void main(String[] args) {
		SpringApplication.run(EmployePortal1Application.class, args);
	}

	
}

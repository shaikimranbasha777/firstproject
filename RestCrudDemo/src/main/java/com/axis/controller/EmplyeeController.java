package com.axis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.entity.Emplyee;
import com.axis.service.EmplyeeService;

@RestController
@RequestMapping("api/v1")
public class EmplyeeController {
	
	@Autowired
	EmplyeeService employeeService;
	
	@PostMapping("/employee")
	public Emplyee addEmplyee(Emplyee employee) {
		return employeeService.addEmployee(employee);
		
	}
	
	@GetMapping("/employee")
	public List<Emplyee> getAllEmployee(){
		return employeeService.getallEmployees();
	}
	
	@GetMapping("/employee/{id}")
	public Emplyee getEmployeeById(int id) {
		return employeeService.getEmployeeById(id);
	}

}

package com.axis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.entity.Emplyee;
import com.axis.repository.EmplyeeRepository;

@Service
public class EmplyeeServiceImpl implements EmplyeeService {

	@Autowired
	EmplyeeRepository employeeRepository;
	
	@Override
	public Emplyee addEmployee(Emplyee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public List<Emplyee> getallEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Emplyee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).get();
	}

}

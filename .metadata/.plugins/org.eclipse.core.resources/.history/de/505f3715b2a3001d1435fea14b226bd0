package com.axis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.entity.Employee;
import com.axis.exception.idNotFoundException;
import com.axis.exception.inValidAgeException;
import com.axis.exception.inValidSalaryException;
import com.axis.repository.EmployeeRepository;

@Service
public class EmployeeServiceImple implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		if(employee.getAge() <= 21) {
			throw new inValidAgeException("Minimum age should be 21");
		}else if(employee.getSalary() < 1000) {
			throw new inValidSalaryException("Salary shuold be morethan 1000");
		}else {
			return employeeRepository.save(employee);
		}
	}

	@Override
	public List<Employee> getallEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {
	Optional<Employee> emp = employeeRepository.findById(id);
	if(emp.isPresent())
		return emp.get();
	else
		throw new idNotFoundException("no id present to get the value");
	}
	@Override
	public Employee updateEmployeeById(int id, Employee employee) {
		Optional<Employee> emp = employeeRepository.findById(id);
		if(emp.isPresent())
			return employeeRepository.saveAndFlush(employee);
		else
			throw new idNotFoundException("no id present to update");
		}
	@Override
	public String deleteEmployeeById(int id) {
	Optional<Employee>emp = employeeRepository.findById(id);
	if(emp.isPresent())
		{
			employeeRepository.deleteById(id);
			return "employee deleted";
		}
		else
			throw new idNotFoundException("no id present to delete");
		}
	


}

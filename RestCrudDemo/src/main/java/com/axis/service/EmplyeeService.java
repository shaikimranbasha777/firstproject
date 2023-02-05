package com.axis.service;

import java.util.List;

import com.axis.entity.Emplyee;

public interface EmplyeeService {
	
	Emplyee addEmployee(Emplyee employee);
	List<Emplyee> getallEmployees();
	Emplyee getEmployeeById(int id);

}

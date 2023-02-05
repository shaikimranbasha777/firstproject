package com.axis;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.axis.entity.Employee;
import com.axis.repository.EmployeeRepository;

@SpringBootApplication
public class SpringDataJpaApplication implements CommandLineRunner{
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// Employee employee = new Employee();
		
		Employee emp3 = new Employee(3, "manish", 45000, "tester", 24);
		
		employeeRepository.save(emp3);
		
		java.util.List<Employee> emp = employeeRepository.findAll();
		for (Employee emp1 : emp) {
			System.out.println(emp1.getId() + " " + emp1.getName());
		}
		
		Optional<Employee> emp2 = employeeRepository.findById(1);
		if(emp2.isPresent()) {
			Employee e = emp2.get();
			//System.out.println(emp2);
			System.out.println(e.getId() + " " + e.getName() + " " + e.getDept());
		}else {
			System.out.println("emplyee nort found");
		}
	}

}

package com.axis;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	int id;
	String name;
	Address address1;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	/*public Address getAddress() {
		return address;
	}*/
	public void setAddress(Address address1) {
		this.address1 = address1;
	}
	public void dispalyEmployeeInfo() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println(address1.streetName);
	}
}

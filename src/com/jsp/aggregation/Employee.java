package com.jsp.aggregation;

public class Employee {
	int id;
	String name;
	EmployeeAddress address;
	
	public Employee(int id, String name, String city, String state, String country) {
		this.id = id;
		this.name = name;
		this.address = new EmployeeAddress(city, state, country);
		
	}

}

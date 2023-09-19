package com.jsp.collection.list;

public class Employee {
	int id;
	String name;
	String position;
	double salary;
	
	public Employee(int id, String name, String position, double salary) {
		this.id = id;
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "[ID: "+id+", Name: "+name+", Position: "+position+", Salary: "+salary+"]";
	}	

}
package com.jsp.constructor;

public class Employee {
	
	// Constructor Overloading and Constructor Chaining
	
	String name;
	int id;
	double salary;
	long cno;
	
	public Employee() {
		System.out.println("No Arguement Constructor");
	}
	
	
	// Constructor - 1
	
	public Employee(int id, String name) {
		this();
		System.out.println("Constructor 1 is called");
		this.id = id;
		this.name = name;
	}
	
	// Constructor - 2
	
	public Employee(int id, String name, double salary) {
		this(id, name);
		System.out.println("Constructor 2 is called");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	// Constructor - 3
	
	public Employee(int id, String name, double salary, long cno) {
		this(id, name, salary);
		System.out.println("Constructor 3 is called");
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.cno = cno;
	}

}

package com.jsp.constructor;

public class Student {
	String name;
	int age;
	int id;
	String address;
	
	// Default Constructor
	public Student() {
		System.out.println("Default Constructor");
	}
	
	// Parameterized Constructor
	public Student(String name, int age, int id, String address) {
		this.name = name;
		this.age = age;
		this.id = id;
		this.address = address;
	}


}

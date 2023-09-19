package com.jsp.objectclasses;

public class Student {
	String name;
	int age;
	int id;
	
	public Student(String name, int age, int id) {
		this.name= name;
		this.age = age;
		this.id = id;
	}
	
	// equals method override 
	
	@Override
	public boolean equals(Object O) {
		Student S = (Student) O;
		return this.id == S.id;
	}
	
	
	//hashCode method override
	
	@Override
	public int hashCode() {
		return id*1234;
	}

}

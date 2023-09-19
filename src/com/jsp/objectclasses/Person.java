package com.jsp.objectclasses;

public class Person {
	String firstName;
	String lastName;
	int age;
	int id;
	
	public Person(String firstName, String lastName, int age, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.id = id;
		
	}
	
	// toString method override
	
	@Override
	public String toString() {
		return firstName+" "+lastName+" ("+age+" years old)"+" [ID:"+id+"]";
	}
	
	// equals method override
	
	@Override
	public boolean equals(Object O) {
		Person P = (Person) O;
		return this.id == P.id;
	}
	
	
	// hashCode method override
	
	@Override
	public int hashCode() {
		return id*1234;
	}

}

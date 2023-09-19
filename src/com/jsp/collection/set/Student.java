package com.jsp.collection.set;

public class Student implements Comparable<Student> {
	String name;
	int id;
	
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	
	@Override
	public String toString() {
		return "[Name: "+name+", ID:"+id+"]";
	}
	
	
	@Override
	public boolean equals(Object O) {
		Student S = (Student) O;
		return this.id == S.id;
	}
	
	@Override
	public int hashCode() {
		return id;
	}


	@Override
	public int compareTo(Student obj) {
		return this.id - obj.id;
	}
	
	
	

}

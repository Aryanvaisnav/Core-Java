package com.jsp.objectclasses;

public class StudentMain {

	public static void main(String[] args) {
		Student S1 = new Student("Max", 15, 9958);
		Student S2 = new Student("Ben", 16, 9968);
		System.out.println(S1.equals(S2));
		System.out.println(S1.hashCode());
		System.out.println(S2.hashCode());
	}

}

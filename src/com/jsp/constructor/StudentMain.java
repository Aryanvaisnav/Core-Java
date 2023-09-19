package com.jsp.constructor;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details");
		System.out.println("==============================================================================");
		
		System.out.print("Enter the name: ");
		String name = sc.next();
		
		System.out.print("Enter the age: ");
		int age = sc.nextInt();
		
		System.out.print("Enter the id: ");
		int id = sc.nextInt();
		
		System.out.print("Enter the address: ");
		String address = sc.next();
		
		System.out.println("================================================================================");
		
		Student Obj = new Student(name, age, id, address);
		System.out.println(Obj.name);
		System.out.println(Obj.age);
		System.out.println(Obj.id);
		System.out.println(Obj.address);
		
		// Closing the Scanner
			sc.close();

	}

}

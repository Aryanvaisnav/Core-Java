package com.jsp.method;

import java.util.Scanner;

public class Sum {
	
	// Method Overloading

	public void sumOfNumbers(int a, int b) {
		int c = a + b;
		System.out.println(c + " ");
	}

	public void sumOfNumbers(int a, int b, int c) {
		int d = a + b + c;
		System.out.println(d + " ");
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int a = sc.nextInt();
		
		System.out.print("Enter the second number: ");
		int b = sc.nextInt();
		
		System.out.print("Enter the third number: ");
		int c = sc.nextInt();
		
		System.out.println("Choose the option to perform addition: ");
		
		System.out.println("1. Sum of " + a + " and " + b);
		System.out.println("2. Sum of " + a + " , " + b + " and " + c);
		
		int choice = sc.nextInt();
		System.out.println(choice + " is selected");
		Sum sum = new Sum();

		switch (choice) {
		case 1: {
			sum.sumOfNumbers(a, b); 
		}
			break;

		case 2: {
			sum.sumOfNumbers(a, b, c);
		}
			break;

		default: {
			System.out.println("Wrong Choice");
		}
		}
		
		sc.close();
	}

}

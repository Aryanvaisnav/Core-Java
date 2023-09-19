package com.jsp.decisionmakingstatement;

import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		System.out.print("Enter the Second Number: ");
		int b = sc.nextInt();

		System.out.println("Choose the operation");
		System.out.println(" 1. Addition ");
		System.out.println(" 2. Subtraction ");
		System.out.println(" 3. Multiplication ");
		System.out.println(" 4. Division ");

		int choice = sc.nextInt();

		switch (choice) {

		case 1: {
			int add = a + b;
			System.out.println(add);
		}
			break;

		case 2: {
			if (a > b) {
				int sub = a - b;
				System.out.println(sub);
			} else {
				int sub = b - a;
				System.out.println(sub);
			}

		}
			break;

		case 3: {
			int multiply = a * b;
			System.out.println(multiply);
		}
			break;

		case 4: {
			int div = a / b;
			System.out.println(div);
		}
			break;

		default: {
			System.out.println("Invalid Number");
		}

		}

		sc.close();

	}

}

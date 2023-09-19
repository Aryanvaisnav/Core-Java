package com.jsp.method;

public class Calculator {

	// static void type

	public static void addition(int a, int b) {
		int add = a + b;
		System.out.println(add);
	}

	// static and return type

	public static int subtraction(int a, int b) {
		if (a > b) {
			int sub = a - b;
			return sub;
		} else {
			int sub = b - a;
			return sub;
		}
	}

	// non - static void type

	public void division(int a, int b) {
		if (b > 0) {
			int div = a / b;
			System.out.println(div);
		} else {
			System.out.println("Undefined");
		}
	}

	// non - static and return type

	public int multiplication(int a, int b) {
		int multiply = a * b;
		return multiply;
	}

}

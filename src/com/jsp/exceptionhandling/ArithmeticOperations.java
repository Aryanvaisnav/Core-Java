package com.jsp.exceptionhandling;

public class ArithmeticOperations {
	
	
	public void division(int a, int b) throws ArithmeticException {
		int div = a/b;
		System.out.println(div);
		addition(a, b);
		
	}
	
	public void addition(int a, int b) {
		int sum  = a + b;
		System.out.println("Addition: " + sum);
		subtraction(a, b);
		
	}
	
	public void subtraction(int a, int b) {
		int sub = a - b;
		System.out.println("Subtraction: " + sub);
		multiplication(a, b);
		
	}
	
	public void multiplication(int a, int b) {
		int multiply = a * b;
		System.out.println("Multiplication: " + multiply);
	}
}

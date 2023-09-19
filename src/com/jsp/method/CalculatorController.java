package com.jsp.method;

public class CalculatorController {

	public static void main(String[] args) {

		// Calling a static method by its class name

		Calculator.addition(10, 20); // method calling statement

		// Calling a static method with return type by its class name

		System.out.println(Calculator.subtraction(100, 200));

		// Calling a non - static method by its object reference

		Calculator c = new Calculator();
		c.division(80, 5);

		// Calling a non - static method with return type by its object reference
		
		System.out.println(c.multiplication(10, 30));

	}

}

package com.jsp.exceptionhandling;

public class ArithmeticOperationsMain {

	public static void main(String[] args) {
		ArithmeticOperations ao = new ArithmeticOperations();
		
		try {
			ao.division(20, 0);
		}
		catch(ArithmeticException a) {
			System.out.println(a.getMessage());
		}
		finally{
			System.out.println("Exception handled");
			System.out.println("Output----------------------------------------------------------------------------------------------------------");
			ao.addition(20, 0);
		}
	
	}

}

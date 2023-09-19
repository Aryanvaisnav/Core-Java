package com.jsp.variable;

public class VariableTypes {
	
	int a = 5; // instance variable  ------ global variable
	static int c = 20; // static variable  -------- global variable
	

	public static void main(String[] args) {
		int a = 10;				// local variable
		System.out.println(a);   // a=10;
		VariableTypes b = new VariableTypes();
		b.printNumber();         
	}
	
	public void printNumber() {
		int c = 25;  			// local variable
		System.out.println(a);  // a=5;
		System.out.println(c);	// c = 25;
		printNumber2();
		
	}
	
	public void printNumber2() {
		System.out.println(a);	// a = 5;
		System.out.println(c);	// c = 20;
		printNumber3();
	}
	
	public static  void printNumber3() {
		VariableTypes d = new VariableTypes();       
		System.out.println(d.a);	// a = 5;
		System.out.println(c);	// c = 20;
		
	}
	

}

	// Observations
// 1. All the non-static members(methods and variables) can be access with the help of objects.
// 2. We can directly call one non-static method inside another non-static method by using method name.
// 3. Global variable can be static or non-static based on use.
// 4. Local variable cannot be static.
// 5. We cannot direct print non-static variable inside static method. We have to use object.
// 6. All the statements should be written inside the method, constructor, initializer block. We cannot write anything outside it.
// 7. Except global variable is declared outside the block of method, constructor, initializer.
// 8. Variable shadowing occurs when the name of local and global variable is same.

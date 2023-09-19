package com.jsp.inheritance;

public class CarMain {

	public static void main(String[] args) {
		CarTesla t1 = new CarTesla();
		t1.setLNO(12345);
		System.out.println(t1.getLNO());
		System.out.println(t1.type); 
		System.out.println(t1.modelNo);
		System.out.println(t1.color);
		
		System.out.println("------------------------------------------------------------------------------------------------------");
		
		CarTesla t2 = new CarTesla(9986, "Black");
		// t2.setLNO(12345);
		System.out.println(t2.getLNO());
		System.out.println(t2.type); 
		System.out.println(t2.modelNo);
		System.out.println(t2.color);

		// Static initializer, Constructor and private members cannot be inheritated by Child class from Parent class. 
		// We are accessing the private member of Car Class with the help of helpers method and that helper method is inherited inside the child class.
	}
	
}

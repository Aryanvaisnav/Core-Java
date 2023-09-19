package com.jsp.aggregation;

public class BikeMain {

	public static void main(String[] args) {
		Bike b = new Bike("BMW", "S 1000 RR", "Red", 5, 999, 205);
		System.out.println("hp: " + b.e.hp);
		System.out.println("cc: " + b.e.cc);
		System.out.println("Number of Cylinders: " + b.e.numberOfCylinder);  
		
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		
		System.out.println("We are accessing the properties of engine using bike object with the help of 'has a relationship'");
		

	}

}

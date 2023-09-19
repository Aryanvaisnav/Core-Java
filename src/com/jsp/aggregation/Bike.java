package com.jsp.aggregation;

public class Bike {
	String brand;
	String color;
	String modelNo;
	BikeEngine e;		// Aggregation
	
	public Bike(String brand, String modelNo, String color, int numberOfCylinder, int hp, int cc) {
		this.brand = brand;
		this.modelNo = modelNo;
		this.color = color;
		this.e = new BikeEngine(numberOfCylinder, hp, cc);	
	}

}

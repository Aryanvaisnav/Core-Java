package com.jsp.constructor;

public class Marker {
	String brand;
	String color;
	double price;
	
	public Marker() {
		System.out.println("Default Constructor");
	}
	
	public Marker(String brand, String color, double price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	static {
		System.out.println("Static initializer");
	}
	
	
	{
		System.out.println("Non - static initializer");
	}
	
	

}

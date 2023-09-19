package com.jsp.inheritance;

public class CarTesla extends Car{
	
	int modelNo;
	String color;
	
	// Default Constructor
	CarTesla() {
		super();
		System.out.println("Tesla constructor is called");
	}
	
	// Parameterized Constructor
	public CarTesla(int modelNo, String color) {
		super(7777, "SUV");
		this.modelNo = modelNo;
		this.color = color;
	}
	
	
}
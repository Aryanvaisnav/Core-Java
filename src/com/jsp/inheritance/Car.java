package com.jsp.inheritance;

public class Car {
	private int LNO;
	String type;
	
	// Initializer
	static {
		System.out.println("Static Initializer");
	}
	
	// Default Constructor
	Car() {
		System.out.println("Car Constructor called");
	}
	
	// Parameterized Constructor
	public Car(int LNO, String type) {
		this.LNO = LNO;
		this.type = type;
	}
	
	// Helpers Method
	void setLNO(int LNO) {
		this.LNO = LNO;
	}
	
	int getLNO() {
		return LNO;
	}
	
	
}
package com.jsp.collection.list;

public class Bike {
	String brand;
	int model;
	
	public Bike(String brand, int model) {
		this.brand = brand;
		this.model =  model;
	}
	
	// toString method override
	
	@Override
	public String toString() {
		return "[Brand: "+brand+", Model: "+model+"]";
	}

}

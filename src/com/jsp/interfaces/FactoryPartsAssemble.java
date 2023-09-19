package com.jsp.interfaces;

public class FactoryPartsAssemble implements RedbullParts, HondaParts {
	public void body() {
		System.out.println("This is Car body");
	}
	
	public void engine() {
		System.out.println("This is Car engine");
		
	}
	
	public void completeCar() {
		body();    // We can call one non-static method inside another non-static method directly inside a same class. 
		engine();
	}

}

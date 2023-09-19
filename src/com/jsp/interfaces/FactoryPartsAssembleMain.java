package com.jsp.interfaces;

public class FactoryPartsAssembleMain {

	public static void main(String[] args) {
		RedbullParts R = new FactoryPartsAssemble();  // UpCasting
		R.completeCar();
		

	}

}

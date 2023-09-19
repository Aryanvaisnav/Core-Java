package com.jsp.interfaces;

public class VehicleMain {

	public static void main(String[] args) {
		Vehicle V1 = new VehicleCar();
		V1.status();
		
		
		Vehicle V2  = new VehicleMotorcycle();
		V2.status();
		

	}

}
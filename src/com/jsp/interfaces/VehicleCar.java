package com.jsp.interfaces;

public class VehicleCar implements Vehicle {
	
	public void start() {
		System.out.println("Car has started");
	}
	
	public void stop() {
		System.out.println("Car has stopped");
	}
	
	public void status() {
		start();
		stop();
	}

}

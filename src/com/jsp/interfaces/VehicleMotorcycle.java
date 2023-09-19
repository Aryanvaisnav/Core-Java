package com.jsp.interfaces;

public class VehicleMotorcycle implements Vehicle{
	
	public void start() {
		System.out.println("Motorcycle has started");
	}
	
	public void stop() {
		System.out.println("Motorcycle has stopped");
		
	}
	
	public void status() {
		start();
		stop();
	}

}

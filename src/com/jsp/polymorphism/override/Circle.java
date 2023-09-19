package com.jsp.polymorphism.override;

public class Circle implements Shape {
	
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		System.out.println("Area of Circle");
		return Math.PI*radius*radius;
	}
	
	
	@Override
	public double calculatePerimeter() {
		System.out.println("Perimeter of Circle");
		return Math.PI*2*radius;
	}



}

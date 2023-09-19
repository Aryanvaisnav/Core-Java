package com.jsp.polymorphism.override;

public class Rectangle implements Shape {
	
	double length;
	double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double calculateArea() {
		System.out.println("Area of Rectangle");
		return length*width;
	}
	
	@Override
	public double calculatePerimeter() {
		System.out.println("Perimeter of Rectangle");
		return 2*(length+width);
	}

}

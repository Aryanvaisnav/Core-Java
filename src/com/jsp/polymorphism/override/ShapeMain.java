package com.jsp.polymorphism.override;

public class ShapeMain {

	public static void main(String[] args) {
		Shape S = new Circle(5.0);
		System.out.println(S.calculateArea());
		System.out.println(S.calculatePerimeter());
		
		
		Shape S1 = new Rectangle(10.0, 20.0);
		System.out.println(S1.calculateArea());
		System.out.println(S1.calculatePerimeter());
		
		
		
		
		
	
		

	}

}

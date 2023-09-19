package com.jsp.method;
import java.util.*;
public class CircumferenceOfCircle {
	
	public static double circumferenceOfCircle(int radius) {
		double Circumference = Math.PI*2*radius;
		return Circumference;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		int radius = sc.nextInt();
		System.out.println("Circumference Of Circle is: "+ circumferenceOfCircle(radius));
		
		// Closing the Scanner
			sc.close();
	}

}

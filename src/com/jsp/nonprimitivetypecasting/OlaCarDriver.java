package com.jsp.nonprimitivetypecasting;

public class OlaCarDriver {
	public static void main(String [] args) {
		OlaCar C = new OlaCarMini(); // UpCasting
		
		System.out.println(C instanceof OlaCarMini); //True
		
		OlaCarMini C1 = (OlaCarMini)C; // DownCasting
		System.out.println(C1.brand_1);
		
		// (Instance of) operator example 
		OlaCar C2 = new OlaCarSUV();
		System.out.println(C2 instanceof OlaCarMini); // False
		
		
		// ClassCastException Example
		OlaCar C3 = new OlaCarMini(); 
		OlaCarSUV C4 = (OlaCarSUV) C3;
		System.out.println(C4.brand_3);
		
		
		
		
	}

}

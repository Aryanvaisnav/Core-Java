package com.jsp.constructor;

public class MarkerController {

	public static void main(String[] args) {
		
		Marker marker = new Marker("Camelin", "Black", 200.0);
		
		System.out.println(marker.brand);
		System.out.println(marker.color);
		System.out.println(marker.price);
		
	}

}

package com.jsp.encapsulation;

public class Mobile {

	String brand;
	String color;
	float price;
	private int password;
	
	Mobile(){
		this("Samsung", "black", 1500000);
	}
	
	Mobile(String brand, String color, float price){
		this.brand = brand;
		this.color = color;
		this.price = price;
		
	}
	
	void setPassword(int password) {
		this.password = password;
		
	}
	
	int getPassword() {
		return password;
	}
	

}

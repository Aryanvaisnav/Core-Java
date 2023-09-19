package com.jsp.collection.list;
import java.util.LinkedList;

public class BikeMain {

	public static void main(String[] args) {
		Bike B1= new Bike("BMW",9960);
		Bike B2 = new Bike("Honda",9345);
		Bike B3 = new Bike("Hero",9200);
		Bike B4 = new Bike("TVS",2660);
		Bike B5 = new Bike("KTM",1560);
		
		LinkedList<Bike> bikelist = new LinkedList<>();		
		bikelist.add(B1);
		bikelist.add(B2);
		bikelist.add(B3);
		bikelist.add(B4);
		bikelist.add(B5);
		
		System.out.println(bikelist); //toString Overridden
		System.out.println(B1); // toString Overridden
		
		
		

	}

}

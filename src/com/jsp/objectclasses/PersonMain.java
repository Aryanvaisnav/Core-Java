package com.jsp.objectclasses;

public class PersonMain {

	public static void main(String[] args) {
		Person P1 = new Person("Ash", "Ketchum", 10, 5785);
		Person P2 = new Person("Shinchan", "Nohara", 5, 7777);
		
		System.out.println(P1);
		System.out.println(P2);
		System.out.println(P1.equals(P2));
		System.out.println(P1.hashCode());
		System.out.println(P2.hashCode());
		

	}

}

package com.jsp.objectclasses;

public class AccountMain {

	public static void main(String[] args) {
		Account A1 = new Account("Ace",5000,952752826);
		Account A2 = new Account("Ben",8000,984575656);
		System.out.println(A1);
		System.out.println(A2);
		
		System.out.println(A1.equals(A2));
		System.out.println(A1.hashCode());
		System.out.println(A2.hashCode());
		
		
	}

}

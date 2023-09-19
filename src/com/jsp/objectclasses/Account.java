package com.jsp.objectclasses;

public class Account {
	String name;
	int balance;
	int AN;
	
	public Account(String name, int balance, int AN) {
		this.name = name;
		this.balance = balance;
		this.AN = AN;
	}
	
	// toString Override
	
	@Override
	public String toString() {
		return "[Name: "+name+", Balance: "+balance+", AccountNumber: "+AN+"]";
	}
	
	
	// equals method override
	
	@Override
	public boolean equals(Object O) {
		Account A = (Account) O;
		return this.AN == A.AN;
	}
	
	
	
	// hashCode method override
	
	@Override
	public int hashCode() {
		return AN*5;
	}
	

}

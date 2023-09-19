package com.jsp.inheritance;

public class Employee extends Company {
	int emp_ID;
	
	Employee(int emp_ID) {
		super("Google");
		this.emp_ID = emp_ID;
		
	}

}

package com.jsp.constructor;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee employee = new Employee(1234, "abc", 1500000.0, 91804273680l);
		
		System.out.println("Employees Details: ========================================= ");
		
		System.out.println(employee.id);
		System.out.println(employee.name);
		System.out.println(employee.salary);
		System.out.println(employee.cno);

	}

}

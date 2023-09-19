package com.jsp.aggregation;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee = new Employee(9986, "Arjun", "Mumbai", "Maharashtra", "India");
		System.out.println("City: " + employee.address.city);
		System.out.println("State: " + employee.address.state);
		System.out.println("Country: " + employee.address.country);

	}

}

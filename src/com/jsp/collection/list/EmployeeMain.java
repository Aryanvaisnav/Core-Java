package com.jsp.collection.list;
import java.util.LinkedList;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee E1 = new Employee(9896,"Max", "Manager", 990000.0);
		Employee E2 = new Employee(7685,"Rex", "Developer", 580000.0);
		Employee E3 = new Employee(3529,"Cooper", "Analyst", 300000.0);
		Employee E4 = new Employee(7876,"Ben", "Tester", 250000.0);
		Employee E5 = new Employee(5845,"Ken", "Trainee", 120000.0);
	
		
		
		LinkedList<Employee> elist = new LinkedList<>();
		elist.add(E1);
		elist.add(E2);
		elist.add(E3);
		elist.add(E4);
		elist.add(E5);

		
		for(Employee E: elist) {
			System.out.println(E);
		}
	}

}
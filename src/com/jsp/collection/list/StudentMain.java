package com.jsp.collection.list;
import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		Student S1 = new Student("Raj", 21);
		Student S2= new Student("Anju", 23);
		Student S3 = new Student("Anya", 22);
		Student S4 = new Student("Vijay", 19);
		Student S5 = new Student("Kishore", 18);
		
		
		ArrayList<Student> studentlist = new ArrayList<>();
		studentlist.add(S1);
		studentlist.add(S2);
		studentlist.add(S3);
		studentlist.add(S4);
		studentlist.add(S5);
		
		System.out.println(studentlist);
		
	}

}
